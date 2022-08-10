package AssessmentGraded.course3.module3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Java Course 3, Module 2, Assignment 3: MySQL JDBC Connectivity (Graded)
 * MySQL JDBC Connectivity - User Policy
 *
 * @author : Niño Galanida
 * Date Created : 06/17/2022
 */
public class User_Policy {

    public static void main(String[] args) {

        try {
            //Construct a database 'Connection' object called 'conn'
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/policy_db", "root", "root");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            //Construct a 'Statement' object called 'stmt' inside the Connection created
            Statement stmt = conn.createStatement();

            /*********************** Retrieve all the user policy details**********************************/

            // Write a SQL query string. Execute the SQL query via the 'Statement'.
            // The query result is returned in a 'ResultSet' object called 'rset1'.
            String strSelect1 = "SELECT DISTINCT policy_no, user_id, date_registered, policy_type_id FROM user_policies";

            //System.out.println("The SQL statement is: " + strSelect1 + "\n"); // Echo For debugging


            ResultSet rset1 =  stmt.executeQuery(strSelect1);


            //Process the 'ResultSet' by scrolling the cursor forward via next().
            //For each row, retrieve the contents of the cells with get(columnName).
            System.out.println("Retrieve all the user policy details"+ "\n" +"The records selected are:"+ "\n" );
            // rset1.next() inside the whole-loop repeatedly moves the cursor to the next row.
            // It returns false if no more rows.
            System.out.printf("%-10s %-10s %-19s %-14s", "POLICY #", "USER ID", "DATE REGISTERED",
                    "POLICY TYPE ID" + "\n");
            while (rset1.next()){    // Repeatedly process each row
                String policyNo = rset1.getString("policy_no");
                String userId = rset1.getString("user_id");
                String dateReg = rset1.getString("date_registered");
                String policyTypeId = rset1.getString("policy_type_id");
                System.out.format("%-10s %-10s %-19s %-14s %n", policyNo, userId, dateReg, policyTypeId);
            }

            /************ Retrieve user policies where registered date is less than ‘2012-01-01’***************/

            // Write a SQL query string. Execute the SQL query via the 'Statement'.
            // The query result is returned in a 'ResultSet' object called 'rset1'.
            String strSelect2 = "SELECT * FROM user_policies WHERE date_registered < '2012-01-01'";

            //System.out.println("The SQL statement is: " + strSelect2 + "\n"); // Echo For debugging

            ResultSet rset2 =  stmt.executeQuery(strSelect2);

            //Process the 'ResultSet' by scrolling the cursor forward via next().
            //For each row, retrieve the contents of the cells with get(columnName).
            System.out.println("---------------------------------------------------------------------"
                    + "\n" +"Retrieve user policies where registered date is less than 2012-01-01"
                    + "\n" + "The records selected are:" + "\n");
            // rset2.next() inside the whole-loop repeatedly moves the cursor to the next row.
            // It returns false if no more rows.
            System.out.printf("%-10s %-10s %-19s %-14s", "POLICY #", "USER ID", "DATE REGISTERED",
                    "POLICY TYPE ID" + "\n");
            while (rset2.next()){    // Repeatedly process each row
                String policyNo = rset2.getString("policy_no");
                String userId = rset2.getString("user_id");
                String dateReg = rset2.getString("date_registered");
                String policyTypeId = rset2.getString("policy_type_id");
                System.out.format("%-10s %-10s %-19s %-14s %n", policyNo, userId, dateReg, policyTypeId);
            }

        } catch(SQLException ex){
            ex.printStackTrace();
        } // Close conn and stmt - Done automatically by try-with-resources
    }
}