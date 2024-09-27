/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

/**
 *
 * @author admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {

    // Database connection parameters
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=DB_4FoodDemo";
    private static final String USERNAME = "sa"; // Replace with your database username
    private static final String PASSWORD = "123456"; // Replace with your database password

    // Method to get a new connection to the database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Load the JDBC driver
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); // Create the connection
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex); // Handle exceptions (you might want to log this instead)
        }
        return connection;
    }
}
