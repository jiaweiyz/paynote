package com.jw.dao;

import com.jw.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 查询全部用户信息
     */
    @Select("SELECT * FROM paynote_user")
    List<User> findAllUser();

    /**
     * paynote_user表 插入数据
     */
    @Insert("Inster info paynote_user (user_id,user_number,user_password,user_name,user_status) values (#{userId},#{userNumber},#{userPassword},#{userUsername},#{userStatus})")
    void addUser(@Param("userId")String userId,
                 @Param("userNumber") String userNumer,
                 @Param("userPassword") String userPassword,
                 @Param("usewrName") String userName,
                 @Param("userStatus") String userStatrus);

}