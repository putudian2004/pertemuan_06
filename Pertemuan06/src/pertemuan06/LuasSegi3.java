/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan06;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-04-29
 */
public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float Al,float Tg){
        alas = Al;
        tinggi = Tg;
    }
    public void setALAS(float nVAL){
        alas = nVAL;
    }
    public float getALAS(){
        return alas;
    }
    public void setTINGGI(float nVAL){
        tinggi = nVAL;
    }
    public float getTINGGI(){
        return tinggi;
    }
    void HLuasSegi3(){
        luas = (this.alas*this.tinggi)/2;
    }
    public float getLUAS(){
        return luas;
    }
}
