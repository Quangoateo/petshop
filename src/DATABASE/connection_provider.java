
package DATABASE;
import java.sql.*;


public class connection_provider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_shop?useSSL=false","root","Matkhau12345");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
