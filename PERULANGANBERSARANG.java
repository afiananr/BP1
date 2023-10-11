/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan.bersarang;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class PERULANGANBERSARANG {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("SEGITIGA ANGKA");
        System.out.print("Masukkan angka = ");
        int angka = s.nextInt();
        for (int i = 0; i <= angka; i++){
            for (int j = 1; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }    
}
