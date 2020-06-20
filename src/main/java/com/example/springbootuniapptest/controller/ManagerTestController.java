package com.example.springbootuniapptest.controller;

import com.example.springbootuniapptest.bean.admin;
import com.example.springbootuniapptest.mapper.AdminTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ManagerTestController {

    @Autowired
    AdminTestMapper adminTestMapper;

    @ResponseBody
    @RequestMapping("/user/test")
    public String test(Map map){

        return "hhj";
    }

    @ResponseBody
    @RequestMapping("/user/getAll")
    public List<admin> getAll(Map map){

        return adminTestMapper.getAll();
    }

    //@ResponseBody
    @RequestMapping("/user/delById")
    public String delById(Integer id){
        adminTestMapper.delById(id);
        return "redirect:/index.html";// 需要把Response去掉
    }

    // 保存
    @ResponseBody
    @RequestMapping("/user/save")
    public String saveAdmin(@RequestBody admin admin){
        adminTestMapper.saveAdmin(admin);
        return "OK";
    }
}
