package com.five6.connect.service.iface;

import com.five6.connect.documents.User;

public interface IUserService {

    User userLogin(String id, String password);

    User findById(String id);

    User findByName(String name);
}
