/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;

/**
 *
 * @author revan
 */
public class peminjaman {
    
     private String no_peminjaman;
    private String id;
  private String tanggal_pinjam;
    private String id_buku;
   
    
    public peminjaman(){
        
    }
    public peminjaman(String no_peminjaman,String id,String tanggal_pinjam,String id_buku){
        this.no_peminjaman=no_peminjaman;
        this.id=id;
        
        this.tanggal_pinjam=tanggal_pinjam;
        this.id_buku=id_buku;
       
              
    }
    
    public String getNoPeminjaman(){
        return no_peminjaman;
    }
    
    public void setNoPeminjaman(String no_peminjaman){
        this.no_peminjaman=no_peminjaman;
    }
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id=id;
    }

    
      public String getTglPinjam(){
        return tanggal_pinjam;
    }
    
    public void setTglPinjam(String tanggal_pinjam){
        this.tanggal_pinjam=tanggal_pinjam;
    }
     public String getId_buku(){
        return id_buku;
    }
    
    public void setIdBuku(String id_buku){
        this.id_buku=id_buku;
    }
     
}
