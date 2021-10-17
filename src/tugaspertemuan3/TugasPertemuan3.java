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
public class TugasPertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String lagi = "y";
        int pilihan;
        
        while (lagi.equals("y")){
        System.out.println("===== Pilih Metode yang Digunakan =====");
        System.out.println("1. Metode Garis Lurus");
        System.out.println("2. Metode Saldo Menurun Ganda");
        System.out.println("3. Metode Saldo Menurun Tunggal");
        System.out.println("=======================================");
        System.out.print("Masukkan pilihan (1/2/3) = ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 : garis_lurus gl = new garis_lurus();gl.garis_lurus();break;
            case 2 : menurun_ganda mg = new menurun_ganda();mg.menurun_ganda();break;
            case 3 : menurun_tunggal mt = new menurun_tunggal();mt.menurun_tunggal();break;
        }
        
        System.out.println("");
        System.out.print("Apakah ingin lagi (y/t)? ");
        lagi = input.next(); 
        }     
    }
}
