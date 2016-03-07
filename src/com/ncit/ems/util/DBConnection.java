/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pravin
 */
public class DBConnection {
    private Connection conn=null;
    public DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.driver");
        conn=DriverManager.getConnection("mysql:jdbc://localhost/ems", "root","");
                    
    }
    
    public int executeUpdate(String sql) throws SQLException{
        Statement stmt=conn.createStatement();
        return stmt.executeUpdate(sql);
    }
       public ResultSet executeQuery(String sql) throws SQLException{
        Statement stmt=conn.createStatement();
        return stmt.executeQuery (sql);
    }
       public void close() throws SQLException{
    if(conn!=null && !conn.isClosed()){
        conn.close();
    }   
}
}