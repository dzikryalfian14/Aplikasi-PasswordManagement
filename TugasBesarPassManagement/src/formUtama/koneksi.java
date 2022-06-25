// ini adalah class koneksi untuk mengoneksikan ke database 
package formUtama;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class koneksi {
    
    Connection conn = null;
    public static Connection Koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/management_password";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(host,user,password);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }    
}
