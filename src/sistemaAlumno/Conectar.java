
package sistemaAlumno;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Conectar {
    Connection con = null;
    private Statement  sentSQL;
    private ResultSet rst;
    public Connection conexion () throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/concurso_estudiantil2","root","");
            System.out.println("Conexion establecida");
        
        } catch (ClassNotFoundException | SQLException e) {
          
            System.out.println("Conexion no establecida");
            JOptionPane.showMessageDialog(null, "error de conexion");
        }
        return con;
    }
    
   public void CerrarConexion(){
        try {
            con.close();
             System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
      public ResultSet Consulta(String sql) throws SQLException{
         
         //executeQuery nos sirve solamente para hacer consultas de la base de datos, solo acepta sentencias como SELECT
         // se necesita forzosamente devolver algo, guardar en una variable el resultado de la consulta
        rst=sentSQL.executeQuery(sql);
        
       return rst;
    }
   
    }


