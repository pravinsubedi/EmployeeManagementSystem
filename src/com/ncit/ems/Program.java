/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.ems;

import com.ncit.ems.dao.EmployeeDAO;
import com.ncit.ems.dao.EmployeeDAOImpl;
import com.ncit.ems.entities.Employee;
import com.ncit.ems.util.Input;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pravin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int choice=0;
        EmployeeDAO dao= new EmployeeDAOImpl(new ArrayList<Employee>());
        do{
        System.out.println("Welcome to employee management system");
        System.out.println("1.Add employee");
        System.out.println("2.Edit employee");
        System.out.println("3.Delete employee");
        System.out.println("4.Search by employee id");
        System.out.println("5.Show all employees");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        try{
        choice=Input.getInt();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }}while(choice!=6);
        switch(choice){
            case 1:
             addEmployee(dao);
             break;
            case 2:
             editEmployee();
             break;
              case 3:
             deleteEmployee();
             break;
              case 4:
             searchEmployee();
             break;
              case 5:
             showallEmployee(dao);
             break;
              case 6:
               System.exit(0);
               break;
             
                
    }     
    }
    public static void addEmployee(EmployeeDAO dao) throws IOException{
        String choice ="Y";
        while(choice.equalsIgnoreCase("Y")){
        Employee e=new Employee();
        System.out.println("enter id");
        int id=Input.getInt();
        e.setId(id);
        System.out.println("enter first name");
        e.setFirstName(Input.getString());
        System.out.println("enter last name");
        e.setLastName(Input.getString());
        System.out.println("enter email");
        e.setEmail(Input.getString());
        System.out.println("enter salary");
        e.setSalary(Input.getDouble());
        dao.insert(e);
        System.out.println("do you want to continue??");
        choice=Input.getString();
        
        
        
    }

}

    private static void editEmployee() {
         //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void searchEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void showallEmployee(EmployeeDAO dao) {
        for(Employee e : dao.getall())
        {
          System.out.println(e.toCSV());  //To change body of generated methods, choose Tools | Templates.
    }
    }
}