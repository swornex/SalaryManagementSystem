package com.iims.dao.impl;

import com.iims.connection.ConnectionFactory;
import com.iims.dao.EmployeeDao;
import com.iims.models.Employee;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public int save(Employee employee) throws SQLException, ClassNotFoundException {
        final String QUERY = "INSERT into employee (name, address, contact, departmentName) VALUES(?,?,?,?)";
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(QUERY);

        preparedStatement.setString(1, employee.getName().trim());
        preparedStatement.setString(2, employee.getAddress().trim());
        preparedStatement.setLong(3, employee.getContact());
        preparedStatement.setString(4, employee.getDepartmentName());

        return preparedStatement.executeUpdate();
    }

    @Override
    public List<Employee> findAll() throws SQLException, ClassNotFoundException {
        final List<Employee> employees = new ArrayList<>();
        final String QUERY = "SELECT * FROM employee";

        Connection connection = ConnectionFactory.getConnection();
        ResultSet resultSet = connection.prepareStatement(QUERY).executeQuery();

        while (resultSet.next()) {
            Employee employee = new Employee();

            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name"));
            employee.setAddress(resultSet.getString("address").split(",")[0]);
            employee.setContact(resultSet.getLong("contact"));
            employee.setDepartmentName(resultSet.getString("departmentName"));

            employees.add(employee);
        }
        return employees;
    }

}
