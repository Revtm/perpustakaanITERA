/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buku;
import koneksi.koneksi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tama
 */
public class DaoBuku {
    buku Bukuu;
    
    public ResultSet tampilinBuku(Connection con, String cari){
    String sql="SELECT * FROM buku;";
        try {
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoBuku.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
}
    
    
    public static void main(String[] args) {
        Connection con;
        koneksi blabla =new koneksi();
        con=blabla.getKoneksi();
        
        DaoBuku daobuku = new DaoBuku();
        
        daobuku.tampilinBuku(con, "AAAA");
        
        
        
    }
    
    
}
