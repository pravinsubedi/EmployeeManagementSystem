/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.ems.dao;

import com.ncit.ems.entities.Employee;
import com.ncit.ems.util.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pravin
 */
public class EmployeeDBIImpl implements EmployeeDAO{

    @Override
    public void insert(Employee e) {
       DBConnection conn=new DBConnection();
       String sql="INSERT INTO Tbl_Employees(first_Name,last_Name,email,salary)VALUES";
       sql+="('"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getEmail()+"',"+e.getSalary()+")";
       conn.executeQuery(sql);       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(double id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> search(double id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getall(){
       List<Employee> employeeList=new ArrayList<Employee>();
       DBConnection conn=new DBConnection();
       String sql="SELECT ALL FROM Tbl_Employees";
       ResultSet rs=conn.executeQuery(sql);
        try {
            while(rs.next()){
                Employee e=new Employee();
                e.setId(rs.getInt("employee_id"));
                e.setFirstName(rs.getString("first_Name"));
                  e.setLastName(rs.getString("last_Name"));
                  e.setEmail(rs.getString("Email"));
                  e.setSalary(rs.getDouble("salary"));
                  employeeList.add(e);
                  return employeeList;
            }
            
            
            //To change body of generated methods, choose Tools | Templates.
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDBIImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
