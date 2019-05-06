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
    String kode;
    
    public user getlogin(Connection con, String id, String password){
        user pengguna;
        String sql = "select kode from akun where id='" + id +"' and pass='" + password +"'";
        String sql2 = "select * from member where id='" + id +"'";
        String sql3 = "select * from admin where id='" + id +"'";
        try{
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                
                    this.kode = rs.getString("kode");
                
                    if("1".equals(this.kode)){
                        pengguna = new user();
                        pengguna.setKode(this.kode);
                        rs = stmt.executeQuery(sql3);
                        if(rs.next()){
                            pengguna.setID(rs.getString("id"));
                            pengguna.setNama(rs.getString("nama"));
                            pengguna.setEmail(rs.getString("email"));
                            
                        }
                        //System.out.println("Selamat datang admin " + pengguna.getNama());
                        return pengguna;
                    }else{
                        pengguna = new member();
                        pengguna.setKode(this.kode);
                        rs = stmt.executeQuery(sql2);
                        if(rs.next()){
                            pengguna.setID(rs.getString("id"));
                            pengguna.setNama(rs.getString("nama"));
                            ((member)pengguna).setProdi(rs.getString("prodi"));
                            pengguna.setEmail(rs.getString("email"));
                        }
                        //System.out.println("Selamat datang member " + pengguna.getNama() +" dari prodi "+ ((member)pengguna).getProdi());
                        return pengguna;
                    }
                   
            }else{
                    System.out.println("Kesalahan login!");
                    
                    
            }
            
            stmt.close();
        }catch (SQLException ex) {
            System.out.println("Gagal terhubung " + ex);
            System.out.println(id +" ");
            
        }
        return null;
        
    }
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Connection konek;
        
        System.out.print("id: "); String id = sc.next();
        System.out.print("passw: "); String password = sc.next();
        
        
        koneksi con = new koneksi();
        
        konek=con.getKoneksi();
        
        login loginuser = new login();
        
        user pengguna;
        pengguna = loginuser.getlogin(konek, id, password);
        
        System.out.println("----------------");
        
        
        
    }
}
