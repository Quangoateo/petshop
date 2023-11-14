package CONTROLLER;

import DATABASE.db_operations;
import MODEL.Staff;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StaffPreparedStatement {

    public static void SignUp(Staff staff) {
        String sql = "INSERT INTO Staff(name, phoneNumber, password, email) "
                + "VALUES('" + staff.getName() + "', '" + staff.getPhoneNumber() + "', '" + staff.getEmail() + "', '" + staff.getPassword() + "')";
        db_operations.set_or_delete(sql, "Insert Successfully!");
    }

    public static Staff LogIn(String email, String password) {
        Staff staff = null;
        try {
            String sql = "SELECT * FROM staff WHERE email = '" + email + "' AND password = '" + password + "' ";
            ResultSet rs = db_operations.getData(sql);
            while (rs.next()) {
                staff = new Staff();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return staff;
    }
    
    public static ArrayList<Staff> Display() {
        ArrayList<Staff> list = new ArrayList<>();
        try {
            ResultSet rs = db_operations.getData("SELECT * FROM staff");
            while (rs.next()) {
                Staff staff = new Staff();
                staff.setStaffID(rs.getInt("staffId"));
                staff.setName(rs.getString("name"));
                staff.setPhoneNumber(rs.getString("phoneNumber"));
                staff.setEmail(rs.getString("email"));
                staff.setPassword(rs.getString("password"));
                list.add(staff);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static Staff Search(int id) {
        ResultSet rs;
        Staff staff = null;
        String query = " SELECT * FROM staff WHERE id = '" + id + "' ";
        rs = db_operations.getData(query);
        try {
            while (rs.next()) {
                staff = new Staff();
                staff.setStaffID(rs.getInt("staffId"));
                staff.setName(rs.getString("name"));
                staff.setPhoneNumber(rs.getString("phoneNumber"));
                staff.setEmail(rs.getString("email"));
                staff.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return staff;
    }

    public static void Create(Staff staff) {
        String sql = "INSERT INTO staff "
                + "VALUES('" + staff.getStaffID() + "', '" + staff.getName() + "', '" + staff.getPhoneNumber() + "', '" + staff.getEmail() + "', '" + staff.getPassword() + "')";
        db_operations.set_or_delete(sql, "Insert Successfully!");

    }

    public static void Delete(String id) {
        String sql = "DELETE FROM staff WHERE id =  '" + id + "'";
        db_operations.set_or_delete(sql, "Delete Successfully!");

    }

    public static void Update(Staff staff) {
        String sql = "UPDATE staff "
                + "SET name = '" + staff.getName() + "', phoneNumber ='" + staff.getPhoneNumber() + "', email = " + staff.getEmail() + ", password = " + staff.getPassword() + " "
                + "WHERE id =  " + staff.getStaffID() + "";
        db_operations.set_or_delete(sql, "Update Successfully!");
    }
}
