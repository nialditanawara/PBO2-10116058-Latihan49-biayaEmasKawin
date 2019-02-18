/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan49.biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210116058Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // TODO code application logic here
         DecimalFormat df = new DecimalFormat();
        DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp ");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
        
        emas objEmas = new emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        
         System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat " + df.format(objEmas.getBeratEmas())
                + " gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah "
                + mataUangIndonesia.format(objEmas.getHargaGram()) + ". Berapa total");
        System.out.println("harus dikeluarkan oleh hendi ?");
        System.out.println("");
        
       
        System.out.printf("Total Bayar Emas : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));

    }
    
}