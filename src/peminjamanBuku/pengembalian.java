/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjamanBuku;

import java.time.LocalDate;

/**
 *
 * @author Tama
 */
public class pengembalian extends peminjaman {
   
    
    String tanggal_kembali;
    
    
         public String getTglKembali(){
 this.tanggal_kembali=LocalDate.now().toString();
 return tanggal_kembali;
    }
    
  
    
    
  
}
