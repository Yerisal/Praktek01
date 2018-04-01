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
public class ProdukAirMineralAksi {
    public static void main(String[] args) {
        ProdukAirMineral AQUA = new ProdukAirMineral();
        ProdukAirMineral LeMinerale = new ProdukAirMineral();
        ProdukAirMineral PROF = new ProdukAirMineral();
        
        AQUA.merek="AQUA";
        AQUA.warna="Biru Tua";
        AQUA.kemasan="Gelas Plastik";
        AQUA.volume="240 ml";
        AQUA.kadaluarsa="BB 200619";
        
        LeMinerale.merek="Le Minerale";
        LeMinerale.warna="Biru Langit";
        LeMinerale.kemasan="Botol Plastik";
        LeMinerale.volume="600 ml";
        LeMinerale.kadaluarsa="Ags 2019";
        
        PROF.merek="PROF";
        PROF.warna="Biru Mudah";
        PROF.kemasan="Botol Plastik";
        PROF.volume="1500 ml";
        PROF.kadaluarsa="150120";
    }
}
