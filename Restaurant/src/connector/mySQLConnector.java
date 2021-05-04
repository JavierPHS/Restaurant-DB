package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mySQLConnector {

    static Connection conn = null;

    public static boolean setConnection() {
        String path = "jdbc:mysql://localhost/sonoo?"
                + "user=root&password=macotoman";

        try {
            conn = DriverManager.getConnection(path);
            return true;
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return false;
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
    
    
}
