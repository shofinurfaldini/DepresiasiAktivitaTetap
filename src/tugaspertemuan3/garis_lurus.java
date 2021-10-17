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
public class garis_lurus {
    public void garis_lurus(){
        Scanner input = new Scanner(System.in);
        double BP, BPA, NR, UE;
        
        System.out.print("Masukkan Biaya Perolehan Aset = ");
        BPA = input.nextDouble();
        System.out.print("Masukkan Nilai Residu = ");
        NR = input.nextDouble();
        System.out.print("Masukkan Umur Ekonomis = ");
        UE = input.nextDouble();
        BP = (BPA - NR) / UE;
        System.out.println("Biaya Penyusutan = "+BP);     
    }
}
