package com.example.springbootuniapptest.controller;

import com.example.springbootuniapptest.bean.ColumnUrl;
import com.example.springbootuniapptest.mapper.ColumnUrlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ColumnUrlController {


    @Autowired
    ColumnUrlMapper columnUrlMapper;

    @ResponseBody
    @GetMapping("/columns")
    public List<ColumnUrl> findAll(){
        return columnUrlMapper.getUrlAll();
    }





}
