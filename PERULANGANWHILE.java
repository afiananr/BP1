/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganwhile;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PERULANGANWHILE {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("PROGRAM BARISAN BILANGAN GANJIL");
        System.out.print("Masukkan nilai n = ");
        int nilai = s.nextInt();
        int i = 1;        
        System.out.print("Barisan bilangan ganjilnya : ");
        while(i<= nilai){
            System.out.print(i+ " ");
            i +=2;                
        }
        System.out.println("");            
    }    
}
