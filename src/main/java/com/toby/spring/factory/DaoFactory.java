package com.toby.spring.factory;

import com.toby.spring.dao.SimpleConnectionMaker;
import com.toby.spring.dao.UserDao;

public class DaoFactory {
    public UserDao userDao() {
        return new UserDao();
    }

    private SimpleConnectionMaker getConnectionMaker() {
        return new SimpleConnectionMaker();
    }
}
