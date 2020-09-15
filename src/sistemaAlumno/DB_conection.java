/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaAlumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author SAMSUNG
 */
public class DB_conection {
  public  Connection GetConnection()
    {
        Connection conexion=null;
     
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/concurso_estudiantil2";
            String usuarioDB="root";
            String passwordDB="";
            conexion= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
           
            
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
    
        
       
    }
  
 
  
 
   

}