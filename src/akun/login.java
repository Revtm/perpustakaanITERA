/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akun;
import java.sql.*;
import java.util.Scanner;
import koneksi.koneksi;
/**
 *
 * @author revan
 */
public class login {
    private String nama;
    private String kode;
    
    public login(Connection con, String id, String password){
        String sql = "select kode from akun where id='" + id +"' and pass='" + password +"'";
        String sql2 = "select nama from member where id='" + id +"'";
        String sql3 = "select nama from admin where id='" + id +"'";
        try{
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                
                    this.kode = rs.getString("kode");
                
                    if("1".equals(this.kode)){
                        rs = stmt.executeQuery(sql3);
                        if(rs.next()) this.nama = rs.getString("nama");
                        System.out.println("Selamat datang admin " + this.nama);
                    }else{
                        rs = stmt.executeQuery(sql2);
                        if(rs.next())this.nama = rs.getString("nama");
                        System.out.println("Selamat datang member " + this.nama);
                    }
                   
            }else{
                    System.out.println("Kesalahan login!");
            }
            
            stmt.close();
        }catch (SQLException ex) {
            System.out.println("Gagal terhubung " + ex);
            
        }
        
        
    }
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Connection konek;
        
        String id = sc.next();
        String password = sc.next();
        
        koneksi con = new koneksi();
        
        konek=con.getKoneksi();
        
        login loginuser = new login(konek, id, password);
        
        
    }
}
