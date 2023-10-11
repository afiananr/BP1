/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan.pkgdo.pkgwhile;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PERULANGANDOWHILE {
    public static void main(String[] args) {    
        Scanner s = new Scanner (System.in);    
        System.out.println("PROGRAM BARISAN BILANGAN GANJIL");
        System.out.print("Masukkan nilai n = ");
        int nilai = s.nextInt();
        int i = 1; 
        System.out.print("Barisan bilangan ganjilnya : ");
        do{
            System.out.print(i + " ");     
            i+=2;   
        }while(i<= nilai);
    }            
}           
        