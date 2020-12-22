package com.practice.java._23javajdbc;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


This is sample program. Please add oracle dependency while running program
public class _1JavaJdbcOracle {

    public static void main(String[] args) {

        try{
            //driver class loading
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //connection object creation
            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","root");

            //statement object creation
            Statement stmt=con.createStatement();

            //query execution
            ResultSet rs=stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));

            //Connection close
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
*/