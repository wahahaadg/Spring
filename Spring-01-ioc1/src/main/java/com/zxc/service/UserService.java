package com.zxc.service;

import com.zxc.dao.UserDao;

public interface UserService {
    // --Commented out by Inspection (2022/6/7 17:19):void getUser();
    void setUserDao(UserDao userDao);

    void getUser();
}
