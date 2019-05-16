/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akun;
import java.sql.*;
import koneksi.koneksi;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author revan
 */
public class daftar {
    String kode;
    String id;
    String nama;
    String email;
    String pass;
    String prodi;
    
    
    public boolean isNull(daftar baru){
        return (baru.kode.isEmpty() || baru.id.isEmpty() || baru.nama.isEmpty() || baru.email.isEmpty() || baru.pass.isEmpty() || baru.prodi.isEmpty());            
    }
    
    public void daftarDB(Connection con, daftar baru){
        String sql = "insert into akun values ('" + baru.id + "','" + baru.pass + "','" + baru.kode + "')";
        String sql2 = "insert into member values ('" + baru.id + "','" + baru.nama + "','" + baru.prodi + "','" + baru.email+ "')";
        String sql3 = "insert into admin values ('" + baru.id + "','" + baru.nama + "','" + baru.email+ "')";
        
        
        try {
            Statement stmt = con.createStatement();
            if(!(baru.isNull(baru))){
                if(!(stmt.execute(sql))){
                    if("1".equals(baru.kode)){
                        if(!(stmt.execute(sql3))){
                            System.out.println("pendaftaran akun admin berhasil");
                        }else{
                            System.out.println("pendaftaran gagal");
                        }
                    }else if ("2".equals(baru.kode)){
                        if(!(stmt.execute(sql2))){
                            System.out.println("pendaftaran akun member berhasil");
                        }else{
                            System.out.println("pendaftaran gagal");
                        }
                    }else{
                        System.out.println("kesalahan tipe user, pendaftaran gagal");
                    }
                    
                }else{
                    System.out.println("pendaftaran akun gagal");
                }
                
            }else{
                System.out.println("Kesalahan isi form");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(daftar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
      
    public static void main(String[] args) {
        Connection con;
        daftar daftarbaru = new daftar();
        koneksi konek = new koneksi();
        
        con = konek.getKoneksi();

        
        Scanner sc = new Scanner(System.in);
        System.out.print("jenis daftar :");
        daftarbaru.kode = sc.next();
        
        System.out.print("input NIP/NIM :");
        daftarbaru.id = sc.next();
        
        System.out.print("input nama :");
        daftarbaru.nama = sc.next();
       
        
        if("2".equals(daftarbaru.kode)){
            System.out.print("input prodi :");
            daftarbaru.prodi = sc.next();
            
        }else{
            daftarbaru.prodi="admin";
        }
        
        System.out.print("input email :");
        daftarbaru.email = sc.next();
        
        System.out.print("input password :");
        daftarbaru.pass = sc.next();
        
        
        daftarbaru.daftarDB(con,daftarbaru);
        
    }
}
