package com.example.springbootuniapptest.mapper;

import com.example.springbootuniapptest.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    // 插入一条数据
    public boolean insertOne(Order order);

    // 删除一条数据
    public boolean deleteOne(Integer id);

    // 根据openid查询订单
    public List<Order> findByOpenid(String openid);

    // 根据订单编号和关键字修改订单状态
    public boolean modifyByIdAndKey(Integer id,String key);

    // 获取订单之后进行的，对goods表的修改操作
    public boolean modifyGoodsByIdAndCount(Integer id,Integer count);

    // 根据id修改支付状态为已经支付
    public boolean changePayStateById(String key,Integer id);



}
