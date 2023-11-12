
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
    public static void Create(Product p )
    {
           String sql = "INSERT INTO product(productID,name,price)"+
                   "VALUES( '"+p.getProductID()+"', '"+p.getName()+"','"+p.getPrice()+"')";
            db_operations.set_or_delete(sql, "Insert successfully!");
    }
      public static void Delete( String id)
    {
      String query = "DELETE FROM product Where productID=  '"+id+"'";
      db_operations.set_or_delete(query,"DELETE SUCCESSFULLY");
      
    }
    public static Product Search(int id)
    {
        ResultSet rs;
        Product p = null;
        String query = " SELECT * FROM product WHERE productID = '"+id+"' ";
        rs = db_operations.getData(query);
        try {
            while(rs.next()) {
                p = new Product();
                p.setProductID(rs.getInt("id"));
                p.setPrice(rs.getDouble("price"));
                p.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return p;
    }
   
    public static void Update(Product p)
    {
        String query = "UPDATE product"
                + " SET price = "+p.getPrice()+", name = '"+p.getName()+"'"
                + " WHERE productID =  "+p.getProductID()+"";
        db_operations.set_or_delete(query,"UPDATE SUCCESSFULLY");
    }
    
    
    
}
