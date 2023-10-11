/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan.pkgfor;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PERULANGANFOR {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int bilangan;        
        System.out.println("PROGRAM BARISAN BILANGAN GANJIL");
        System.out.print("Masukkan nilai n = ");
        int nilai = s.nextInt();        
        System.out.print("Barisan bilangan ganjilnya : ");
        for ( int i = 1; i <= nilai; i++){
            System.out.print(i+ " ");   
            i++;
        }    
    }
}