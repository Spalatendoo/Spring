package com.lk.mapper;

import com.lk.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    //添加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
