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
    private int idbuku;
    private String posisi;
    private String status;
    private String kategori;
    private int isbn;
  
   
    
    public buku(){
        
    }
    public buku(String judul,int isbn,String penerbit,int idbuku,String posisi,String status,String penulis,String kategori){
        this.judul=judul;
        this.penerbit=penerbit;
        this.idbuku=idbuku;
        this.posisi=posisi;
        this.status=status;
        this.kategori=kategori;
        this.isbn=isbn;
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
     public int getIdBuku(){
        return idbuku;
    }
    
    public void setGetIdBuku(int idbuku){
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
    public String getKategori(){
        return kategori;
    }
    
    public void setKategori(String kategori){
        this.kategori=kategori;
    }
    
    public int getIsbn(){
        return isbn;
    }
    public void setGetIsbn(int isbn){
        this.isbn=isbn;
    }
}
