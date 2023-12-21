package pkg100.days;

import java.util.Scanner;

public class day74_perulangan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        byte nilai = sc.nextByte();
        byte angka = 0;
        System.out.println("Angka yang habis jika dibagi 3 dari 1 sampai "+nilai+" yaitu ");
        for (int i = 1; i < nilai; i++) {
            if(i % 3 == 0){
                angka++;
                System.out.println(i);
            }
        }
        System.out.println("jumlah angka yang habis jika, dibagi 3 yaitu : " + angka + " angka");
        
    }
    
}
