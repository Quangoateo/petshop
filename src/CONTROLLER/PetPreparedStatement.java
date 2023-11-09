
package CONTROLLER;

import java.util.ArrayList;
import CONTROLLER.Pet;
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
                p.setName(rs.getString("name"));
                p.setBreed(rs.getString("breed"));
                p.setAge(rs.getInt("age"));
                p.setPrice(rs.getDouble("price"));
                pet_array_list.add(p);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return pet_array_list ; 
    }
    
    
}
