package com.lk.service;

import com.lk.dao.UserDao;

public class UserServiceImpl implements UserService{
//业务层调Dao层
    //private UserDao userDao = new UserDaoMysqlmpl();

    private UserDao userDao;

    //利用set进行动态实现值的注入

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
