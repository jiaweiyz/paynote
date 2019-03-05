package com.jw.dao;

import com.jw.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 查询全部用户信息
     */
    @Select("SELECT * FROM paynote_user")
    List<User> findAllUser();

}