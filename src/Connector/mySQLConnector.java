package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mySQLConnector {

    static Connection conn = null;
    static Statement statement = null;
    static ResultSet rs = null;
    
    public static Connection setConnection() {
        String user = "root";
        String password = "csunconnection";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", user, password);
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
    
    
    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(mySQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet search(String query) {
        try {
            Statement statement = conn.createStatement();
                       ResultSet rs = statement.executeQuery(query); // result set
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(mySQLConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int genID(String table) {
        try {
            int id = 1;
            String query;
            ResultSet rs;
            PreparedStatement ps;
            //gen ID for customer
            if("Customer".equals(table)) {
                query = "SELECT CustomerID FROM Customer";
                ps = mySQLConnector.setConnection().prepareStatement(query);
                rs = ps.executeQuery(query);
                while (rs.next()) {
                    int x = rs.getInt("customerID");
                    if (id != x) { //if id value is not currently in database
                        return id;
                    }
                    id++;
                }
                return id;
            }
            //gen id for orderID
            else {
                query = "SELECT orderID FROM Food_Order";
                ps = mySQLConnector.setConnection().prepareStatement(query);
                rs = ps.executeQuery(query);
                while (rs.next()) {
                    int x = rs.getInt("orderID");
                    if (id != x) { //if id value is not currently in database
                        return id;
                    }
                    id++;
                }
                return id;
            }
        } catch (SQLException e) {
            Logger.getLogger(mySQLConnector.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    } //end genID
}