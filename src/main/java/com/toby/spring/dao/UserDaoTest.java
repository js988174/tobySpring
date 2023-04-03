package com.toby.spring.dao;

import com.toby.spring.entity.User;
import com.toby.spring.factory.DaoFactory;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("1");
        user.setName("제이크");
        user.setPassword("jakejake");

        dao.add(user);

        System.out.println(user.getId() + " register succeeded");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " query succeeded");
    }
}
