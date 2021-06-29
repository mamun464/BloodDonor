package Log_In;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLClientNotification {
	Connection conn=null;
	
  public static Connection DbConnector() {
    try {
       Class.forName("org.sqlite.JDBC");
       Connection conn =DriverManager.getConnection("jdbc:sqlite:ClientNotification.sqlite");
       return conn;
    } 
    catch (ClassNotFoundException | SQLException e) { 
       System.out.println(e);
       System.out.println("YES CONNECT");
    }
  return null;
}
}