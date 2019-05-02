/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akun;

/**
 *
 * @author revan
 */
public class user {
    private String id;
    private String nama;
    private String email;
    
    public void setID(String nama){
        this.nama = nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setProdi(){
        
    };
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getID(){
        return this.email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getProdi(){
        return "prodi";
    };
    
    public String getEmail(){
        return email;
    }
}
