/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN25EJAANNAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String namaDepan = input.next();
        System.out.println("");
        System.out.println("Ejaan untuk \"" + namaDepan + "\" adalah : ");
        for(int i = 1; i <= namaDepan.length(); i++){
            System.out.println("Huruf Ke-" + i + " : " + namaDepan.substring(i-1,i));
        }
        System.out.println("");
    }   
}

    

