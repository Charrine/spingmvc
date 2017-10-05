package com.five6.connect.dao.IDao;

import com.five6.connect.documents.User;

public interface IUserDao {
    User userLogin(String id,String password);
    User findById(String id);
    User findByName(String name);
}
