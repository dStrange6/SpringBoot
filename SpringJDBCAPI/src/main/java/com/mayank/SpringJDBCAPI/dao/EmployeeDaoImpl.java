package com.mayank.SpringJDBCAPI.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements IEmployeePersistence
{
    @Autowired
    private DataSource dataSource;

    List<Employee> employees;

    @Override
    public List<Employee> getAllEmployee()
    {
        try
        {
            System.out.println(dataSource.getClass()); //HikariDataSource
            Connection connection = dataSource.getConnection();  //connection from HikariCP
            System.out.println(connection.getClass()); //HikariProxyConnection
            PreparedStatement ps = connection.prepareStatement("select * from employee");
            ResultSet rs = ps.executeQuery();
            employees = new ArrayList();
            while (rs.next())
            {
                Employee emp = new Employee();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setCity(rs.getString(3));
                emp.setSalary(rs.getDouble(4));

                employees.add(emp);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return employees;
    }
}
