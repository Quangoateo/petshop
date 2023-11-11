package CONTROLLER;
import java.util.ArrayList;
import java.sql.*;
import DATABASE.db_operations;
import javax.swing.JOptionPane;

public class PetPreparedStatement {
    //displlay to table
    public static ArrayList<Pet> Display()
    {
        ArrayList<Pet> pet_array_list = new ArrayList<>();
        try{
            ResultSet rs = db_operations.getData("SELECT * FROM pet");
            while(rs.next()) {
                Pet p = new Pet();
                p.setId(rs.getInt("id"));
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
    public static void Create(Pet p)
    {
            String sql = "INSERT INTO pet(id, breed,age,price,name)"+
                   "VALUES( '"+p.getId()+"',  '"+p.getBreed()+"', '"+p.getAge()+"', '"+p.getPrice()+"', '"+p.getName()+"')";
            db_operations.set_or_delete(sql, "Insert successfully!");
            
       
    }
    public static void Delete( String id)
    {
      String query = "DELETE FROM pet Where id =  '"+id+"'";
      db_operations.set_or_delete(query,"DELETE SUCCESSFULLY");
      
    }
    
}