package pkg100.days;

import java.util.Scanner;

import java.util.Arrays;

public class day61_ArrayD1 {
    public static void main(String[] args) {
        
        int jumlah = 0;
        Scanner sc = new Scanner(System.in);
  
        int[] angka = new int[3];
        System.out.println("Masukkan element angka ");
        for (int i = 0; i < 3; i++) {
                    angka[i] = sc.nextInt();
        }
        System.out.println("Elemen angka adalah ");
        for (int i = 0; i < 3; i++) {
        }
        System.out.println(Arrays.toString(angka));
        
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("Total angka jika dijumlahkan adalah "+ jumlah);
        
    }
    
}
