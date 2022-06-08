package com.zxc.service;

import com.zxc.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set进行动态注入
    public void setUserDao(UserDao userDao) {//将传入的dao赋值给创建的Impl
        this.userDao = userDao;
    }

    @Override
    public void getUser() {//然后再用传入的dao进行方法调用
        userDao.getUser();
    }
}
