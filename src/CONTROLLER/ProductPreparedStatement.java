package CONTROLLER;

import MODEL.Product;
import java.sql.*;
import java.util.*;
import DATABASE.db_operations;
import javax.swing.JOptionPane;

public class ProductPreparedStatement {

    public static ArrayList<Product> Display() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            ResultSet rs = db_operations.getData("SELECT * FROM product");
            while (rs.next()) {
                Product p = new Product();
                p.setProductID(rs.getInt("productID"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                list.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static void Create(Product p) {
        String sql = "INSERT INTO product "
                + "VALUES('" + p.getProductID() + "', '" + p.getName() + "', '" + p.getPrice() + "')";
        db_operations.set_or_delete(sql, "Insert Successfully!");
    }

    public static Product Search(String id) {
        Product p = new Product();
        String sql = "SELECT * FROM product WHERE productID = " + id + "";
        try {
            ResultSet rs = db_operations.getData(sql);
            while (rs.next()) {
                p.setProductID(rs.getInt("productID"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return p;
    }
    
    public static void Update(Product p) {
        String query = "UPDATE product "
                + "SET price = " + p.getPrice() + ", name = '" + p.getName() + "' "
                + "WHERE productID =  " + p.getProductID() + "";
        db_operations.set_or_delete(query, "Update Successfully!");
    }

    public static void Delete(String id) {
        String query = "DELETE FROM product WHERE productID =  '" + id + "'";
        db_operations.set_or_delete(query, "Delete Successfully!");
    }
}
