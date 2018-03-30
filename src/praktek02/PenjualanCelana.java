/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author ijul
 */
public class PenjualanCelana {
    
    int harga_celana;
    int jumlah_celana;
    
    public PenjualanCelana() {
     harga_celana=200000;
     jumlah_celana=2;
     
    }
    
    void tampildata(){
    System.out.println("================================");
    System.out.println("harga_celana     :"+harga_celana);
    System.out.println("jumlah_celana     :"+jumlah_celana);
    System.out.println("================================");
    
    }
    
    
    Integer hitungPembelian(){
            int total;
            total=harga_celana*jumlah_celana;
            return total;
            
    }
     void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
        
     }
    
}
