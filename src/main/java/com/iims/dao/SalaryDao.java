package com.iims.dao;

import com.iims.models.Salary;

import java.sql.SQLException;
import java.util.List;

public interface SalaryDao {
    int save(Salary salary) throws SQLException, ClassNotFoundException;

    List<Salary> findAll() throws SQLException, ClassNotFoundException;

    Salary findOne(int id) throws SQLException, ClassNotFoundException;

    int update(Salary salary) throws SQLException, ClassNotFoundException;

    int remove(int id) throws SQLException, ClassNotFoundException;
}
