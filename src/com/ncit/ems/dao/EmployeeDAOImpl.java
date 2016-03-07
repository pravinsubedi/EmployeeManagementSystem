/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.ems.dao;

import com.ncit.ems.entities.Employee;
import java.util.List;

/**
 *
 * @author pravin
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    private List<Employee> employeeList;
    public EmployeeDAOImpl(List<Employee> employeeList)
    {
        this.employeeList=employeeList;
    }

    @Override
    public void insert(Employee e) {
        employeeList.add(e); //To change body of generated methods, choose Tools | Templates.
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
    public List<Employee> getall() {
        return employeeList; //To change body of generated methods, choose Tools | Templates.
    }
    
}
