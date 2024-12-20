package hotelmanagement;
import java.sql.*;
public class MyConnection {
    static Connection con = null;
    public static Connection connect(){     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/hotel?user=root&password=");
    }
    catch(Exception e){
        System.out.println(e);
    }        
    return con;
    }
}
