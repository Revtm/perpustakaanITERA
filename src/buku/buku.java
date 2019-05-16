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

    private String kategori;
    private String isbn;
    private String penulis;
    private String deskripsi;
  

    public buku(){
        
    }

    public buku(String judul,String isbn,String penerbit,String idbuku,String posisi,String status,String penulis,String kategori,String deskripsi){
       this.judul=judul;
        this.penerbit=penerbit;
        this.idbuku=idbuku;
        this.posisi=posisi;
        this.status=status;
        this.kategori=kategori;
        this.isbn=isbn;
        this.penulis=penulis;
        this.deskripsi=deskripsi;
          

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
        return this.deskripsi;
    }
    public void setGetDeskripsi(String deskripsi){
        this.deskripsi=deskripsi;
    }
    
    public void setKategori(String kategori){
        this.kategori=kategori;
    }
    
    public String getKategori(){
        return kategori;
    }
}
