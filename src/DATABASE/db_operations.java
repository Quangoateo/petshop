/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATABASE;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;

/**
 *
 * @author USER
 */
public class db_operations {
    public static void set_or_delete (String query, String message)
    {
        try{
            Connection conn = connection_provider.getCon();
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            if(!message.equals(""))
            {
                   JOptionPane.showMessageDialog(null, message);
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e,"messange",JOptionPane.ERROR_MESSAGE);
        }
    }
}
