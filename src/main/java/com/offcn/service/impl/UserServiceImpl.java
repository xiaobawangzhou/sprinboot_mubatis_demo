package com.offcn.service.impl;

import com.offcn.dao.UserDao;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //@Autowired
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAllUser();
    }

    @Override
    public User getOne(Integer id) {
        return userDao.getOne(id);
    }

    @Override
    public void updateUser(Integer id, User user) {
        user.setId(id);
        userDao.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.delete(id);
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }
}
