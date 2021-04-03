package com.ghy.demo6.jdbc;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        ConnectionPool connection=new ConnectionPool();
        Connection connection1=connection.getConnection();
        System.out.println(connection1);
    }
}
