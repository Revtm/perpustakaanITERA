/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author revan
 */
public class buku {
     private String judul;
    private String penerbit;
    private String idbuku;
    private String posisi;
    private String status;
<<<<<<< HEAD
    private String kategori;
    private String isbn;
    private String penulis;
    private String deskripsi;
  
   
=======
    private String penulis;
    private String deskripsi;
>>>>>>> 47490857193af9e5d9d095ae3b6dba3f11f6f0d3
    
    public buku(){
        
    }
<<<<<<< HEAD
    public buku(String judul,String isbn,String penerbit,String idbuku,String posisi,String status,String penulis,String kategori,String deskripsi){
=======
    public buku(String judul,String penerbit,int idbuku,String posisi,String status,String penulis,String deskripsi){
>>>>>>> 47490857193af9e5d9d095ae3b6dba3f11f6f0d3
        this.judul=judul;
        this.penerbit=penerbit;
        this.idbuku=idbuku;
        this.posisi=posisi;
        this.status=status;
<<<<<<< HEAD
        this.kategori=kategori;
        this.isbn=isbn;
        this.penulis=penulis;
        this.deskripsi=deskripsi;
  
=======
        this.penulis=penulis;
        this.deskripsi=deskripsi;
        
>>>>>>> 47490857193af9e5d9d095ae3b6dba3f11f6f0d3
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setGetPenerbit(String penerbit){
        this.penerbit=penerbit;
    }
    public String getJudul(){
        return judul;
    }
    
    public void setGetJudul(String judul){
        this.judul=judul;
    }
     public String getIdBuku(){
        return idbuku;
    }
    
    public void setGetIdBuku(String idbuku){
        this.idbuku=idbuku;
    }
     public String getPosisi(){
        return posisi;
    }
    
    public void setGetPosisi(String posisi){
        this.posisi=posisi;
    }
     public String getStatus(){
        return status;
    }
    
    public void setGetStatus(String status){
        this.status=status;
    }
     public String getPenulis(){
        return penulis;
    }
    
    public void setGetPenulis(String penulis){
        this.penulis=penulis;
    }
<<<<<<< HEAD
    
    public String getIsbn(){
        return isbn;
    }
    public void setGetIsbn(String isbn){
        this.isbn=isbn;
    }
     public String getPenulis(){
        return penulis;
    }
    public void setGetPenulis(String penulis){
        this.penulis=penulis;
    }
     public String getDeskripsi(){
        return isbn;
    }
    public void setGetDeskripsi(String isbn){
        this.isbn=isbn;
=======
     public String getDeskripsi(){
        return deskripsi;
    }
    
    public void setGetDeskripsi(String deskripsi){
        this.deskripsi=deskripsi;
>>>>>>> 47490857193af9e5d9d095ae3b6dba3f11f6f0d3
    }
}
