/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan06;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-04-29
 */
public class Persegi {
    private float sisi1, sisi2, luas, keliling;
    
    public Persegi(float s1, float s2){
        sisi1 = s1;
        sisi2 = s2;
    }
    
    public void setSisi1(float s){
        sisi1 = s;
    }
    
    public float getSisi1(){
        return sisi1;
    }
    
    public void setSisi2(float s){
        sisi2 = s;
    }
    
    public float getSisi2(){
        return sisi2;
    }
    
    public void hitungLuas(){
        luas = sisi1 * sisi2;
    }
    
    public float getLuas(){
        return luas;
    }
    
    public void hitungKeliling(){
        keliling = 2 * (sisi1 + sisi2);
    }
    
    public float getKeliling(){
        return keliling;
    }
}

