/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author proWindows8.1
 */
public class ProdukAirMineral {
    String merek;
    String warna;
    String kemasan;
    String volume;
    String kadaluarsa;
    
    void cetakInfo(){
        System.out.println("Merek Produk        :"+merek);
        System.out.println("Warna Label         :"+warna);
        System.out.println("Jenis Kemasan       :"+kemasan);
        System.out.println("Isi Bersih          :"+volume);
        System.out.println("Tanggal Kadaluarsa  :"+kadaluarsa);
        
        System.out.println("");
        System.out.println("Mengurangi Dehidrasi");
        System.out.println("Menambah Cairan Tubuh");
        System.out.println("Meningkatkan Daya Tahan Tubuh");
        System.out.println("");
    }
}
