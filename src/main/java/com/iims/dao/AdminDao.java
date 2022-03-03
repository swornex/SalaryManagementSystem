package com.iims.dao;

import com.iims.models.Admin;

import java.sql.SQLException;g

public interface AdminDao {
    Admin findOne(String email, String password) throws SQLException, ClassNotFoundException;
}
