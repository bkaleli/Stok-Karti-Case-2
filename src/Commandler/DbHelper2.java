package Commandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper2 {
	private String userName ="root";
	private String password = "12345";
	private String dbUrl = "jdbc:mysql://localhost:3306/mydb";

    public Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception) {
    	System.out.println("ERROR : " + exception.getMessage());
    	System.out.println("Error code : " + exception.getErrorCode());
    } 
	
}
