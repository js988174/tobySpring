package com.toby.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Deprecated
public class SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "root", "1111");
        return c;
    }
}
