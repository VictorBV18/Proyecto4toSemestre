
package Connexion;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conexionmysql {

        Connection cn;
        public Connection conectar(){
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cine","localbd","contraseña1");
                System.out.println("CONECTADO");
            } catch (Exception e) {
                System.out.println("Error de Conexion"+e);
            }
            return cn;
        }
    
}