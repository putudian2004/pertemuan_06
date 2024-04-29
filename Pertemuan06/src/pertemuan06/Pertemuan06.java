/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan06;

import java.util.Scanner;

/**
 *
 * @author  Dian Sariani (2201010254)
 * TGL : 2024-04-29
 */
public class Pertemuan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.println("Nilai Alas : ");
        float nAlas = dIN.nextFloat();
        
        System.out.println("Nilai Tinggi : ");
        float nTinggi = dIN.nextFloat();
        
        LuasSegi3 LS = new LuasSegi3(nAlas, nTinggi);
        
//        LS.setALAS(71);
//        LS.setTINGGI(86);
        LS.HLuasSegi3();
        
        System.out.println("Nilai Alas : " + LS.getALAS() );
        System.out.println("Nilai Tinggi : " + LS.getTINGGI() );
        System.out.println("Jadi Luas Segi Tiga: ");
        System.out.println("Luas = ½ X Alas X Tinggi");
        System.out.println("    = ½ X "+ LS.getALAS()+" X "+LS.getTINGGI() );
        System.out.println("    = " + LS.getLUAS() );

    }
    
}
