package ActivityUngraded.course3.module3;

import java.sql.*;
/**
 * Java Course 3, Module 3, Ungraded Practice Activity
 * Ungraded Practice Activity 3 - Java JDBC
 *
 * @author : Niño Galanida
 * Date Created : 06/17/2022
 *
 */

public class JavaJDBC{
    public static void main(String[] args) {

        try {
            // Step 1: Construct a database 'Connection' object called 'conn'
            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/Norima", "root", "root");
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

            // Step 2: Construct a 'Statement' object called 'stmt' inside the Connection created
            Statement stmt = conn.createStatement();

            // Step 3: Write a SQL query string. Execute the SQL query via the 'Statement'.
            //  The query result is returned in a 'ResultSet' object called 'rset'.
            String strSelect = "SELECT DISTINCT FirstName, Lastname FROM person";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            ResultSet rset =  stmt.executeQuery(strSelect);


            // Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            // Row-cursor initially positioned before the first row of the 'ResultSet'.
            // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
            // It returns false if no more rows.
            System.out.format("%-15s %-15s %n", "First Name","Last Name");
            while (rset.next()){    // Repeatedly process each row
                String fname = rset.getString("FirstName");  // retrieve a 'String'-cell in the row
                String lname = rset.getString("Lastname");   // retrieve a 'String'-cell in the row
                System.out.format("%-15s %-15s %n", fname,lname);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        } catch(SQLException ex){
            ex.printStackTrace();
        }   // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)

    }
}