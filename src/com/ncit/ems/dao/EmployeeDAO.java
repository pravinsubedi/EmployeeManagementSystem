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
public interface EmployeeDAO {
    public void insert(Employee e);
    public void update(Employee e);
    public void delete(double id);
    public List<Employee> search(double id);
    public List<Employee> getall();
    
}
