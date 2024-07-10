package bank.management.system;

import java.sql.*;
//understand how to connect our java project to database
public class Conn {
    //register the driver
    //create connection
    //create statement
    //execute query
    //close connection
    Connection c;
    Statement s;
    public Conn(){
        try{
            //Java automatically registers then driver so below line not needed
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "moti@Sql1");
            s = c.createStatement();

        } catch (Exception e){
            System.out.println(e);
        }
    }

}
