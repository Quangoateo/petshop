package DATABASE;
import CONTROLLER.customer;
import java.sql.*;
import javax.swing.JOptionPane;
public class Customer_prepared_statement {
    public static void Save(customer cust1)
    {
        String sql = "INSERT INTO customer(name,contactInfo,password,email)"
                + "VALUES('"+cust1.getName()+"', '"+cust1.getContactInfo()+"', '"+cust1.getPassword()+"', '"+cust1.getEmail()+"')";
        db_operations.set_or_delete(sql, "Insert successfully!");
        
    }
}
