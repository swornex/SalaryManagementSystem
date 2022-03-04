package com.iims.dao;

import com.iims.models.Admin;

import java.sql.SQLException;

public interface AdminDao {
    Admin findOne(String username, String password) throws SQLException, ClassNotFoundException;
}
