package DATABASE;
import CONTROLLER.User;
import java.sql.*;
import javax.swing.JOptionPane;

public class Customer_prepared_statement {
    public static void Save(User cust1)
    {
        String sql = "INSERT INTO customer(name, contactInfo, password, email)"
                + "VALUES('"+cust1.getName()+"', '"+cust1.getContactInfo()+"', '"+cust1.getPassword()+"', '"+cust1.getEmail()+"')";
        db_operations.set_or_delete(sql, "Insert successfully!");
    }
    
    public static User LogIn(String email, String password)
    {
        User cust = null;
        try {
            String sql = "SELECT * FROM Customer WHERE email = '"+email+"' AND password = '"+password+"' ";
            ResultSet rs = db_operations.getData(sql);
            while(rs.next()){
                cust = new User();
            }
        } 
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cust;
    }
}

