/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penggunaan.operasi.relasi;

/**
 *
 * @author baciel
 */
public class PenggunaanOperasiRelasi
{
    public static void main(String[] args) {
    //beberapa niali
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Nilai variabel...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    k = " + k);
        
    //lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println("    i > j = " + (i > j)); //false
        System.out.println("    j > i = " + (j > i)); //true
        System.out.println("    k > j = " + (k > j)); //false
        
    //Lebih besar atau sama dengan
        System.out.println("Lebih besar dari atau sama dengan...");
        System.out.println("    i >= j = " + (i >= j)); //false
        System.out.println("    j >= i = " + (j >= i)); //true
        System.out.println("    k >= j = " + (k >= j)); //true
        
    //Lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("    i < j = " + (i < j)); //true
        System.out.println("    j < i = " + (j < i)); //false
        System.out.println("    k < j = " + (k < j)); //false
       
    //Lebih kecil atau sama dengan
        System.out.println("Lebih kecil dari sama dengsn...");
        System.out.println("    i <= j = " + (i <= j)); //true
        System.out.println("    j <= i = " + (j <= i)); //false
        System.out.println("    k <= j = " + (k <= j)); //true
        
    //sama dengan
        System.out.println("sama dengan...");
        System.out.println("    i == j = " + (i == j)); //false
        System.out.println("    j == i = " + (j == i)); //true
        
    //tidak sama dengan
        System.out.println("tidak sama dengan...");
        System.out.println("    i == j = " + (i == j)); //true
        System.out.println("    j == i = " + (j == i)); //false 
       
    }
    
}
