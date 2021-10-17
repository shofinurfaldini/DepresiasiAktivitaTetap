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
public class menurun_ganda {
    public void menurun_ganda(){
        Scanner input = new Scanner(System.in);
        double BP, BPA, PDG;
        
        System.out.print("Masukkan Biaya Perolehan Aset = ");
        BPA = input.nextDouble();
        System.out.print("Masukkan Presentase Depresi Ganda (dalam desimal "
                + "dan sudah dikali 2) = ");
        PDG = input.nextDouble();
        BP = BPA * PDG;
        System.out.println("Biaya Penyusutan = "+BP);
    }
}
