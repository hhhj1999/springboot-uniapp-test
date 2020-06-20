package com.example.springbootuniapptest.controller;

import com.example.springbootuniapptest.bean.Order;
import com.example.springbootuniapptest.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderMapper orderMapper;

    @ResponseBody
    @PostMapping("/sentOrder")
    public List<Order> multiple(@RequestBody List<Order> order){
        System.out.println(order);
        String openid = "";
        for(Order odr : order){
            openid = odr.getOpenid();
            System.out.println(odr);
            orderMapper.insertOne(odr);
            orderMapper.modifyGoodsByIdAndCount(odr.getId(),odr.getCountt());
        }
        List<Order> orders = orderMapper.findByOpenid(openid);
        return orders;
    }

    // 订单页面查询订单
    @ResponseBody
    @PostMapping("/requestOrder")
    public List<Order> request(@RequestBody String openid){
        List<Order> orders = orderMapper.findByOpenid(openid);
        return orders;
    }

    // 根据id修改订单支付状态
    @ResponseBody
    @PostMapping("/changePayState")
    public void changePayState(@RequestBody Integer id){
        String paystate = "已付款";
       orderMapper.changePayStateById(paystate,id);

    }



}
