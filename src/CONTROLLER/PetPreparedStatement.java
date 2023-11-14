package CONTROLLER;

import MODEL.Pet;
import java.util.ArrayList;
import java.sql.*;
import DATABASE.db_operations;
import javax.swing.JOptionPane;

public class PetPreparedStatement {

    public static ArrayList<Pet> Display() {
        ArrayList<Pet> list = new ArrayList<>();
        try {
            ResultSet rs = db_operations.getData("SELECT * FROM pet");
            while (rs.next()) {
                Pet p = new Pet();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setBreed(rs.getString("breed"));
                p.setAge(rs.getInt("age"));
                p.setPrice(rs.getDouble("price"));
                list.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public static Pet Search(int id) {
        ResultSet rs;
        Pet p = null;
        String query = " SELECT * FROM pet WHERE id = '" + id + "' ";
        rs = db_operations.getData(query);
        try {
            while (rs.next()) {
                p = new Pet();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setBreed(rs.getString("breed"));
                p.setAge(rs.getInt("age"));
                p.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return p;
    }

    public static void Create(Pet p) {
        String sql = "INSERT INTO pet "
                + "VALUES('"+p.getId()+"', '"+p.getName()+"', '"+p.getBreed()+"', '"+p.getAge()+"', '"+p.getPrice()+"')";
        db_operations.set_or_delete(sql, "Insert Successfully!");

    }

    public static void Delete(String id) {
        String query = "DELETE FROM pet WHERE id =  '"+id+"'";
        db_operations.set_or_delete(query, "Delete Successfully!");

    }
    
    public static void Update(Pet p) {
        String query = "UPDATE pet "
                + "SET name = '"+p.getName()+"', breed ='"+p.getBreed()+"', age = "+p.getAge()+", price = "+p.getPrice()+" "
                + "WHERE id =  "+p.getId()+"";
        db_operations.set_or_delete(query, "Update Successfully!");
    }

}
