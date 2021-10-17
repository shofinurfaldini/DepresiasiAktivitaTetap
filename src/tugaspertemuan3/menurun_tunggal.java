/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class menurun_tunggal {
    public void menurun_tunggal(){
        Scanner input = new Scanner(System.in);
        double BP, BPA, PDT;
        
        System.out.print("Masukkan Biaya Perolehan Aset = ");
        BPA = input.nextDouble();
        System.out.print("Masukkan Presentase Depresi Tunggal "
                    + "(dalam desimal) = ");
        PDT = input.nextDouble();
        BP = BPA * PDT;
        System.out.println("Biaya Penyusutan = "+BP);
    }
}
