package com.five6.connect.service.impl;

import com.five6.connect.dao.DaoImpl.UserDao;
import com.five6.connect.dao.IDao.IUserDao;
import com.five6.connect.documents.User;
import com.five6.connect.service.iface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {


    @Autowired
    private IUserDao userDao;

    public User userLogin(String id, String password) {
        return userDao.userLogin(id, password);
    }

    public User findById(String id) {
        return userDao.findById(id);
    }

    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
