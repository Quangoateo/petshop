/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATABASE;
import java.sql.*;
/*
 *
 * @author USER
 */

public class connection_provider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_shop?useSSL=false","root","Matkhau12345");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            
            return null;
        }
    }
}
