package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {
    //获取所有用户
    public List<User> getUserList();

    //获取单个用户
    public User getOne(Integer id);

    //修改用户
    public void updateUser(Integer id,User user);

    //删除用户
    public void deleteUser(Integer id);

    //添加用户
    public void addUser(User user);
}
