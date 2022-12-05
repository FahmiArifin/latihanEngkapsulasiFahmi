/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan_ekapsulasi;

/**
 *
 * @author Fahmi Arifin
 */
public class Latihan_ekapsulasi {

    public static void main(String[] args) {
  
                nilai N = new nilai();
        N.setNilaiPraktek(90);
        N.setNilaiTiori(86);
        System.out.println("Nilai praktek = " +N.getNP());
        System.out.println("Nilai teori = " +N.getNT());
        System.out.println("Nilai akhir = " +N.getNa());
    }
    
}    

