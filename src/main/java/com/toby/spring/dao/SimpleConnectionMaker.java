package com.toby.spring.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface SimpleConnectionMaker {
    Connection makeNewConnection() throws ClassNotFoundException, SQLException;
}
