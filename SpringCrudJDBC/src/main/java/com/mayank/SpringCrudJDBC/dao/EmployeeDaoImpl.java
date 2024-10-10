package com.mayank.SpringCrudJDBC.dao;

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

    private final String INSERT_EMPLOYEE = "Insert into employee values(?,?,?,?)";
    private final String SELECT_EMPLOYEES = "Select * from employee";
    private final String DELETE_EMPLOYEE = "delete from employee where id=?";
    private final String SELECT_EMPLOYEE = "Select * from employee where id=?";


    @Override
    public List<Employee> getAllEmployee()
    {
        List<Employee> employees;
        try
        {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.hashCode());
            PreparedStatement pstmt = connection.prepareStatement(SELECT_EMPLOYEES);
            ResultSet rs = pstmt.executeQuery();
            employees = new ArrayList<>();
            while (rs.next())
            {
                Employee emp = new Employee();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setCity(rs.getString(3));
                emp.setSalary(rs.getDouble(4));
                employees.add(emp);
            }
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return employees;

    }

    @Override
    public Employee getEmployee(Integer id)
    {
        Employee employee;
        try
        {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(SELECT_EMPLOYEE);
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            employee = new Employee();
            while (rs.next())
            {
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setCity(rs.getString(3));
                employee.setSalary(rs.getDouble(4));
            }


        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return employee;
    }

    @Override
    public boolean deleteEmployee(Integer id)
    {
        Connection connection = null;
        int rs = 0;
        try
        {
            connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(DELETE_EMPLOYEE);
            pstmt.setInt(1,id);
            rs = pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return rs > 0;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee)
    {
        int rs = 0;
        try
        {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.hashCode());
            PreparedStatement pstmt = connection.prepareStatement(INSERT_EMPLOYEE);
            pstmt.setInt(1, employee.getId());
            pstmt.setString(2, employee.getName());
            pstmt.setString(3, employee.getCity());
            pstmt.setDouble(4,employee.getSalary());
            rs = pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        if (rs > 0)
            System.out.println("Employee added successfully .....");
        else
            System.out.println("Employee not added ......");

    }
}
