package pkg100.days;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        //penggunaan Scanner dan tipe data
        Scanner input = new Scanner(System.in);
        String nama, asalSekolah, alamat;
        byte umur;
        nama = input.nextLine();
        asalSekolah = input.nextLine();
        alamat = input.nextLine();
        umur = input.nextByte();
        
        System.out.println("- - -  - - - - - -");
        
        System.out.println("nama: " + nama);
        System.out.println("asal seolah: " + asalSekolah);
        System.out.println("alamat: " + alamat);
        System.out.println("umur: " + umur + " tahun");
        
        System.out.println("+ + + + + + + + + + + + + ");
        
        //penggunaan Scanner pada operator dasar (operator perbandingan)
        int angka1, angka2, angka3, angka4, angka5, angka6;
        boolean hasil;
        angka1 = input.nextInt();
        angka2 = input.nextInt();
        angka3 = input.nextInt();
        angka4 = input.nextInt();
        angka5 = input.nextInt();
        angka6 = input.nextInt();
        
        hasil = angka2 < angka3;
        System.out.println("hasil < adalah " + hasil);
        
        hasil = angka3 <= angka4;
        System.out.println("hasil <= adalah " + hasil);
        
        hasil = angka1 > angka6;
        System.out.println("hasil > adalah " + hasil);
        
        hasil = angka5 >= angka2;
        System.out.println("hasil >= adalah " + hasil);
        
        hasil = angka4 != angka1;
        System.out.println("hasil != adalah " + hasil);
    }
    
}
