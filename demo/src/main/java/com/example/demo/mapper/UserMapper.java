package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserBean getInfo(@Param(value = "name") String name, @Param(value = "password")String password);
}
