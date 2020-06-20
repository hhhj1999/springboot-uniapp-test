package com.example.springbootuniapptest.controller;

import com.example.springbootuniapptest.bean.ColumnUrl;
import com.example.springbootuniapptest.bean.Goods;
import com.example.springbootuniapptest.bean.OpenIdJson;
import com.example.springbootuniapptest.mapper.GoodsMapper;
import com.example.springbootuniapptest.utils.HttpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    GoodsMapper goodsMapper;

    @ResponseBody
    @GetMapping("/goods")
    public List<Goods> findAll(){
        return goodsMapper.getGoodsAll();
    }

    @ResponseBody
    @GetMapping("/columnsPrefer")
    public List<Goods> findPrefer(){
        return goodsMapper.getGoodsPrefer();
    }


    @ResponseBody
    @PostMapping("/sort")
    public List<Goods> sort(@RequestBody  Integer id){
        if(id == 0)
            return goodsMapper.getGoodsAll();
        else if(id == 1)
            return goodsMapper.getGoodsAllBySalecount();
        else if(id == 2)
            return goodsMapper.getGoodsAllByPriceASC();
        else
            return goodsMapper.getGoodsAllByPriceDESC();
    }

    @ResponseBody
    @PostMapping("/sort/price")
    public List<Goods> sortPrice(@RequestBody  Integer id){
        if(id == 0)
            return goodsMapper.getGoodsAllByPriceASC();
        else if(id == 50)
            return goodsMapper.getGoodsByPrice(1,50);
        else if(id == 200)
            return goodsMapper.getGoodsByPrice(51,200);
        else
            return goodsMapper.getGoodsByPrice(201,20000);// 设置一个限值20000
    }

    @ResponseBody
    @PostMapping("/sort/year")
    public List<Goods> sortYear(@RequestBody  Integer id){
        if(id == 0)
            return goodsMapper.getGoodsAll();
        else if(id == 4)
            return goodsMapper.getGoodsByYear(4,0);
        else if(id == 5)
            return goodsMapper.getGoodsByYear(10,5);
        else
            return goodsMapper.getGoodsByYear(200,11);// 设置一个限值200
    }

    @ResponseBody
    @PostMapping("/search/name")
    public List<Goods> searchByName(@RequestBody  String key){
        System.out.println(key);
        System.out.println(goodsMapper.getGoodsByName(key).toString());
        return goodsMapper.getGoodsByName(key);
    }


    // 获取ID和密钥
    private String appID = "wx33e37b7794433702";
    private String appSecret = "1ad90afea4f12cd1c049bc260d2a8280";

    @ResponseBody
    @PostMapping("/wxuser")
    public String userLogin(@RequestBody String code) throws IOException, IOException {
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret="
                            + this.appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        OpenIdJson openIdJson = mapper.readValue(result, OpenIdJson.class);
        System.out.println(result.toString());
        System.out.println(openIdJson.getOpenid());
        //return result;

        goodsMapper.insertUser(openIdJson.getOpenid());
        return openIdJson.getOpenid();
    }

}
