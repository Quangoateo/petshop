/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DATABASE.db_operations;
import MODEL.Customer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author TG
 */
public class CustomerPreparedStatement {
    public static ArrayList<Customer> Display() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            ResultSet rs = db_operations.getData("SELECT * FROM customer");
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setCustomerID(rs.getInt("staffId"));
                cus.setName(rs.getString("name"));
                cus.setPhoneNumber(rs.getString("phoneNumber"));
                list.add(cus);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static Customer Search(int id) {
        ResultSet rs;
        Customer cus = null;
        String query = " SELECT * FROM customer WHERE id = '" + id + "' ";
        rs = db_operations.getData(query);
        try {
            while (rs.next()) {
                cus.setCustomerID(rs.getInt("customerId"));
                cus.setName(rs.getString("name"));
                cus.setPhoneNumber(rs.getString("phoneNumber"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cus;
    }

    public static void Create(Customer cus) {
        String sql = "INSERT INTO customer "
                + "VALUES('" + cus.getCustomerID() + "', '" + cus.getName() + "', '" + cus.getPhoneNumber() + "')";
        db_operations.set_or_delete(sql, "Insert Successfully!");

    }

    public static void Delete(String id) {
        String sql = "DELETE FROM customer WHERE id =  '" + id + "'";
        db_operations.set_or_delete(sql, "Delete Successfully!");

    }

    public static void Update(Customer cus) {
        String sql = "UPDATE customer "
                + "SET name = '" + cus.getName() + "', phoneNumber ='" + cus.getPhoneNumber() + "' "
                + "WHERE id =  " + cus.getCustomerID() + "";
        db_operations.set_or_delete(sql, "Update Successfully!");
    }
}
