package com.program;
// Created by 21343017_Aldhy
//perulangan bersarang
public class latihan9 {
    public static void main(String[] args) {
        
    int baris,kolom,hasil_kali;
    int MAKS =5;

    for(baris=1; baris<=MAKS; baris++){
        for(kolom=1; kolom<=MAKS; kolom++){
                hasil_kali=baris*kolom;
                System.out.print("\t"+hasil_kali);
             }
             System.out.println("");
        }
    }
        
}