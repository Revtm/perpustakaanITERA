/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;


/**
 *
 * @author revan
 */
public class koneksi {
    public Connection con;
    
    public Connection getKoneksi(){
        try {
            
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpustakaan", "root","");
         return con;
         
        } catch (SQLException ex) {
            System.out.println("Gagal " + ex);
            return con;
        }
    }
    
}
