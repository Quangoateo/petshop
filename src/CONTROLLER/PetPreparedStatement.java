package CONTROLLER;
import java.util.ArrayList;
import java.sql.*;
import DATABASE.db_operations;
import javax.swing.JOptionPane;

public class PetPreparedStatement {
    public static ArrayList<Pet> Display()
    {
        ArrayList<Pet> pet_array_list = new ArrayList<>();
        try{
            ResultSet rs = db_operations.getData("SELECT * FROM pet");
            while(rs.next()) {
                Pet p = new Pet();
                p.setBreed(rs.getString("breed"));
                p.setAge(rs.getInt("age"));
                p.setPrice(rs.getDouble("price"));
                p.setName(rs.getString("name"));
                pet_array_list.add(p);
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pet_array_list ; 
    }
}