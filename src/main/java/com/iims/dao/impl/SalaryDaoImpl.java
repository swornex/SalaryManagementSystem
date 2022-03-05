package com.iims.dao.impl;

import com.iims.connection.ConnectionFactory;
import com.iims.dao.SalaryDao;
import com.iims.models.Salary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalaryDaoImpl implements SalaryDao {
    @Override
    public int save(Salary salary) throws SQLException, ClassNotFoundException {
        final String QUERY = "INSERT INTO salary (employeeId, basicSalary, allowance) VALUES (?,?,?)";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);

        preparedStatement.setInt(1, salary.getEmployeeId());
        preparedStatement.setInt(2, salary.getBasicSalary());
        preparedStatement.setInt(3, salary.getAllowance());

        return preparedStatement.executeUpdate();
    }

    @Override
    public List<Salary> findAll() throws SQLException, ClassNotFoundException {
        List<Salary> salaries = new ArrayList<>();
        final String QUERY = "SELECT * FROM salary";
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(QUERY);

        while (resultSet.next()) {
            Salary salary = new Salary();
            salary.setId(resultSet.getInt("id"));
            salary.setEmployeeId(resultSet.getInt("employeeId"));
            salary.setBasicSalary(resultSet.getInt("basicSalary"));
            salary.setAllowance(resultSet.getInt("allowance"));
            salaries.add(salary);
        }

        return salaries;
    }

    @Override
    public Salary findOne(int id) throws SQLException, ClassNotFoundException {
        final String QUERY = "SELECT * FROM salary WHERE id = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Salary salary = null;

        while (resultSet.next()) {
            salary = new Salary();
            salary.setId(resultSet.getInt("id"));
            salary.setEmployeeId(resultSet.getInt("employeeId"));
            salary.setBasicSalary(resultSet.getInt("basicSalary"));
            salary.setAllowance(resultSet.getInt("allowance"));
        }

        return salary;
    }

    @Override
    public Salary findOneByEmployeeId(int id) throws SQLException, ClassNotFoundException {
        final String QUERY = "SELECT * FROM salary WHERE employeeId = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Salary salary = null;

        while (resultSet.next()) {
            salary = new Salary();
            salary.setId(resultSet.getInt("id"));
            salary.setEmployeeId(resultSet.getInt("employeeId"));
            salary.setBasicSalary(resultSet.getInt("basicSalary"));
            salary.setAllowance(resultSet.getInt("allowance"));
        }

        return salary;
    }

    @Override
    public int update(Salary salary) throws SQLException, ClassNotFoundException {
        final String QUERY = "UPDATE salary SET basicSalary = ?, allowance = ? WHERE id = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, salary.getBasicSalary());
        preparedStatement.setInt(2, salary.getAllowance());
        preparedStatement.setInt(3, salary.getId());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int remove(int id) throws SQLException, ClassNotFoundException {
        final String QUERY = "DELETE FROM salary WHERE id = ?";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate();
    }
}
