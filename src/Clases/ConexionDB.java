package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionDB {
    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="gamemaps.com23";
    /*private static final String bd="taller4";
    private static final String puerto="3306";
    private static final String ip="localhost";*/
    //private static final String url="jdbc:mysql://"+ip+":"+puerto+"/"+bd;  //"jdbc:mysql://localhost:3306/login?characterEncoding=utf8";
    private static final String url="jdbc:mysql://localhost:3306/taller4?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
// Funcion que va conectarse a mi bd de mysql
    /*public Connection estableceConectar() {
    
      try{
          Class.forName("com.mysql.jdbc.Driver");
          conectar = DriverManager.getConnection(url, user, pass);
          JOptionPane.showMessageDialog(null,"Se conecto correctamente a la Base de Datos");

         
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
      return conectar;
    }

    Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}*/
    public Connection conectar(){
      con = null;
      try{
          con = (Connection) DriverManager.getConnection(url, user, pass);
          if(con!=null){
          }
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
      }
      return con;
    }
}

