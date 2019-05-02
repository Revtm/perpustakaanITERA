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
public class member extends user{
    private String prodi;
    
    public void setProdi(String prodi){
        this.prodi=prodi;
    }
    
    @Override
    public String getProdi(){
        return this.prodi;
    }
}
