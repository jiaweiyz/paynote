package com.jw.controller;

import com.jw.bean.JsonResult;
import com.jw.bean.User;
import com.jw.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/user")
public class UserController {
    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @ApiOperation(value = "findAllUser",notes = "获取全部用户列表")
    @RequestMapping("/findAllUser")
    List<User> findAllUser(){
        log.info("/findAllUser 开始处理");
        return userService.findAllUser();
    }

    public JsonResult addUser(){
        return null;
    }
}