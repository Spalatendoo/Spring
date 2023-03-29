package com.lk.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add one user");
    }

    @Override
    public void delete() {
        System.out.println("delete one user");
    }

    @Override
    public void update() {
        System.out.println("update one user");
    }

    @Override
    public void query() {
        System.out.println("query one user");
    }
}
