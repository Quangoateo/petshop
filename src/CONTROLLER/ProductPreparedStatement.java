
package CONTROLLER;
import java.sql.*;
import java.util.*;
import DATABASE.db_operations;
import javax.swing.JOptionPane;
public class ProductPreparedStatement {
    public static ArrayList<Product> Display()
    {
        ArrayList<Product> product_list = new ArrayList<>();
        try{
            ResultSet rs = db_operations.getData("SELECT * FROM product");
            while(rs.next()) {
                Product p = new Product();
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                p.setProductID(rs.getInt("productID"));
                product_list.add(p);
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product_list ;
    }
}
