package pkg100.days;

import java.util.Scanner;

public class day98_Method {

    public static void main(String[] args) {
        
        day98_Method lama = new day98_Method();
        
        Integer angka = lama.cepat();
        Character karakter1 = lama.karakter();
        lama.name();
        lama.kelas();
        System.out.println("Sekarang tahun " + angka + "24");
        System.out.println("Dengan predikat " + karakter1);
        
    }
    Integer cepat(){
        return 20;
    }
    Character karakter(){
        return 'A';
    }
    void name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println();
        System.out.println("Perkenalkan nama saya " + nama);
    }
    void kelas(){
        System.out.println("Dari kelas Informatika B 23");
    }
    
}
