package com.example.springbootuniapptest.mapper;

import com.example.springbootuniapptest.bean.admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminTestMapper {
    // 查询所有
    public List<admin> getAll();

    // 根据id删除一条数据
    public void delById(Integer id);

    // 保存一下新添加的用户
    void saveAdmin(admin admin);
}
