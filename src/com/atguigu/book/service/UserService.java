package com.atguigu.book.service;

import com.atguigu.book.pojo.User;

public interface UserService {
    User login(String name, String pwd);
    void regist(User user);
    User getUser(String uname);
}
