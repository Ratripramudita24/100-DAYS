package pkg100.days;

import java.util.Scanner;

public class day24_konfersiNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("batas nilai maksimum dan minimum byte adalah -128 sampai 127");
        System.out.println("harap gunakan nilaiInt dibawah -128 atau diatas 127");
        System.out.println("============================================================");
        System.out.println("masukkan nilai int: ");
        int nilaiInt = scan.nextInt();
        byte nilaiByte = (byte) nilaiInt;
        
        System.out.println("============================================================");
        System.out.println("nilai asli integer adalah " + nilaiInt);
        System.out.println("nilai konfersi byte adalah " + nilaiByte);
    }
    
}
