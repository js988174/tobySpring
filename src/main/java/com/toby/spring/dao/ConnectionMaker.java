package com.toby.spring.dao;

import java.sql.Connection;
import java.sql.SQLException;

@Deprecated
public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
