package pkg100.days;

import java.util.Scanner;

public class day58_ArrayD1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka ");
        n = sc.nextInt();
        int[] angka = new int[3];
        System.out.println("Masukkan element angka ");
        for (int i = 0; i < n; i++) {
                    angka[i] = sc.nextInt();
        }
        System.out.println("Elemen angka adalah ");
        for (int i = 0; i < n; i++) {
            System.out.println(angka[i]);
        }
        
        
    }
    
}
