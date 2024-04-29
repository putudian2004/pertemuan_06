/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan06;

import java.util.Scanner;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-04-29
 */
public class Latihan_pertemuan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai sisi 1: ");
        float sisi1 = input.nextFloat();
        
        System.out.println("Masukkan nilai sisi 2: ");
        float sisi2 = input.nextFloat();
        
        Persegi persegi = new Persegi(sisi1, sisi2);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        
        System.out.println("Nilai Sisi 1: " + persegi.getSisi1());
        System.out.println("Nilai Sisi 2: " + persegi.getSisi2());
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
    }
}
