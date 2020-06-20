package com.example.springbootuniapptest.mapper;


import com.example.springbootuniapptest.bean.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    public List<Goods> getGoodsAll();

    public List<Goods> getGoodsPrefer();

    public List<Goods> getGoodsAllBySalecount();

    public List<Goods> getGoodsAllByPriceDESC();

    public List<Goods> getGoodsAllByPriceASC();

    public List<Goods> getGoodsByPrice(Integer low,Integer high);

    public List<Goods> getGoodsByYear(Integer low,Integer high);

    public List<Goods> getGoodsByName(String key);

    public void insertUser(String openid);
}
