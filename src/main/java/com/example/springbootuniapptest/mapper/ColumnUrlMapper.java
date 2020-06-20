package com.example.springbootuniapptest.mapper;

import com.example.springbootuniapptest.bean.ColumnUrl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ColumnUrlMapper {

    public List<ColumnUrl> getUrlAll();
}
