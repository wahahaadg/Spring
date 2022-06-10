package com.zxc.mapper;

import com.zxc.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User user);
    int deleteUser(int id);
}
