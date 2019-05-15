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
    
    user baru;
    
    
    public boolean isNull(user baru){
        return (baru.getKode().isEmpty()|| baru.getID().isEmpty() || baru.getNama().isEmpty() || baru.getEmail().isEmpty() || baru.getPass().isEmpty() || ((member)baru).getProdi().isEmpty());            
    }
    
    public void daftarDB(Connection con, user baru){
        this.baru = baru;
        
        String sql = "insert into akun values ('"+ baru.getID() + "','"+ baru.getPass() +"','" + baru.getKode() + "')";
        String sql2 = "insert into member values ('" + baru.getID() +"','" + baru.getNama() + "','" + ((member)baru).getProdi() + "','" + baru.getEmail()+ "')";
        String sql3 = "insert into admin values ('" + baru.getID() +"','" + baru.getNama() + "','" + baru.getEmail()+ "')";
        
        
        try {
            Statement stmt = con.createStatement();
            if(!(this.isNull(baru))){
                if(!(stmt.execute(sql))){
                    if("1".equals(baru.getKode())){
                        if(!(stmt.execute(sql3))){
                            System.out.println("pendaftaran akun admin berhasil");
                        }else{
                            System.out.println("pendaftaran gagal");
                        }
                    }else if ("2".equals(baru.getKode())){
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
        user daftarbaru = new member();
        daftar daftarSekarang = new daftar();
        koneksi konek = new koneksi();
        
        con = konek.getKoneksi();

        
        Scanner sc = new Scanner(System.in);
        System.out.print("jenis daftar :");
        daftarbaru.setKode(sc.next());
        
        System.out.print("input NIP/NIM :");
        daftarbaru.setID(sc.next());
        
        System.out.print("input nama :");
        daftarbaru.setNama(sc.next());
       
        
        if("2".equals(daftarbaru.getKode())){
            System.out.print("input prodi :");
            ((member)daftarbaru).setProdi(sc.next());
            
        }else{
           ((member)daftarbaru).setProdi("admin");
        }
        
        System.out.print("input email :");
        daftarbaru.setEmail(sc.next());
        
        System.out.print("input password :");
        daftarbaru.setPass(sc.next());
        
        
        daftarSekarang.daftarDB(con,daftarbaru);
        
    }
}
