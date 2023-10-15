package pkg100.days;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        //operator dasar - operator logika
        Scanner input = new Scanner(System.in);
        boolean hasil, nilai, lanjutan;
        boolean angka1, angka2, angka3;
        hasil = true;
        nilai = false;
        lanjutan = true;
        angka1 = nilai;
        angka2 = lanjutan;
        angka3 = hasil;
        
        boolean jawaban = angka3 && hasil;
        System.out.println("hasil &&: "+ jawaban);
        //true && true = true
        
        boolean jawaban_lain = angka3 || angka1;
        System.out.println("hasil ||: " + jawaban_lain);
        //true || false = true
        
        System.out.println("hasil !: " + !angka3);
        //true ! = false
        
        boolean jawaban2 = angka2 && nilai;
        System.out.println("hasil &&: " + jawaban2);
        //true && false = false
        
        boolean jawaban_lain2 = angka1 || nilai;
        System.out.println("hasil ||: " + jawaban_lain2);
        //false || false = false
        
        System.out.println("hasil !: "+ !angka1);
        // false ! = true
        
        boolean jawaban3 = nilai && angka1;
        System.out.println("hasil &&: " + jawaban3);
        //false && false = false
        
        boolean jawaban_lain3 = angka2 || lanjutan;
        System.out.println("hasil ||: " + jawaban_lain3);
        //true || true = true
        
        
        }
    }
