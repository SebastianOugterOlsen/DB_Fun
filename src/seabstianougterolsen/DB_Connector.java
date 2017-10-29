package seabstianougterolsen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connector {
    // declare a connection
    private static Connection con = null;
    // JDBC driver
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // the url = jdbc:dbms//host name:port#/db name
    private static String url = "jdbc:mysql://127.0.0.1:3306/sys";
    // user name
    private static String usr = "root";
    // password
    private static String pswrd = "12345";


        public static Connection connect() {
            System.out.println("\n--Connecting to MySQL JDBC");
            // Locate MySQL JDBC Driver
            try {
                Class.forName(DRIVER);
            }
            // Catch exceptions if JDBC is not found
            catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                System.out.println("\n--JDBC driver is missing--");
            }

            System.out.println("\n--MySQL JDBC driver registered--");

            try {
                // Connect to MySQL DB = URL, usrName, pswrd
                con = DriverManager.getConnection(url, usr, pswrd);
            }
            // Catch exceptions on connection error
            catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("\n--Did not connect try again--");
            }
            //if connection successful
            if (con != null) {
                System.out.println("\n--Connection successfull--");
            } else {
                // if connection fails
                System.out.println("\n--Failed to connect--");
            }
            return con;


        }
}
