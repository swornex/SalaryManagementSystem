package com.iims.dao.impl;

import com.iims.connection.ConnectionFactory;
import com.iims.dao.AdminDao;
import com.iims.models.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImpl implements AdminDao {
    @Override
    public Admin findOne(String username, String password) throws SQLException, ClassNotFoundException {
        final String QUERY = "SELECT * FROM admin WHERE username = ? AND password = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        Admin admin = null;
        while (resultSet.next()) {
            admin = new Admin();
            admin.setId(resultSet.getInt("id"));
            admin.setName(resultSet.getString("name"));
            admin.setUsername(resultSet.getString("username"));
        }
        return admin;
    }
}
