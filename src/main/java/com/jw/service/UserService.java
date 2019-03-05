package com.jw.service;

import com.jw.bean.User;
import com.jw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    /**
     * 查询全部用户信息
     * @return
     */
    @Transactional
    public List<User> findAllUser(){
        return  userDao.findAllUser();
    }

}
