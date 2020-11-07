/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan34.objectorientedkalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program kalkulator dengan object oriented
 */
public class PBOIF210119043Latihan34ObjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator hitung = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukan Angka ke-1 : ");
        hitung.value1 = scanner.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        hitung.value2 = scanner.nextDouble();
        System.out.println();
        
        System.out.println("Hasil pertambahan : " + hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + hitung.kurangBilangan());
        System.out.println("Hasil Perkalian : " + hitung.kaliBilangan());
        System.out.println("Hasil Pembagian : " + hitung.bagiBilangan());
        System.out.println("Hasil Sisa : " + hitung.sisaBilangan());
    }
    
}
