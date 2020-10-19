/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan4.kambing;
/**
 * 
 * @author 
 * NAMA     : DIAN ARPIAN
 * KELAS    : IF10K
 * NIM      : 10119916
 * Deskripsi Program : Kambing
 */
public class Kambing {
    
      public void tambahKambing(){
      //Deklarasi Variabel Lokal
      
      int jumlahKambing = 0;
      
      jumlahKambing =jumlahKambing + 5;
      System.out.println("jumlah kambing setelah ditambah:" + jumlahKambing);
      }

    public static void main(String[] args) {
      Kambing kambingJantan = new Kambing();
      kambingJantan.tambahKambing();
    }
    
}
