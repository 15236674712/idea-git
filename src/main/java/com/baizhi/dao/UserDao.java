package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {

    User queryByUserId(String id);

    List<User> queryAll();

    List<User> queryAlls();
    List<User> queryAllss();
}
