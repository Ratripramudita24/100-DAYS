package pkg100.days;

import java.util.Random;
import java.util.Scanner;

public class day26_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random random = new Random();
        
        System.out.print("Masukkan angka minimum: ");
        int min = input.nextInt();
        System.out.print("Masukkan angka maksimum: ");
        int max = input.nextInt();
        
        if (min >= max) {
            System.out.println("Angka minimum harus lebih kecil dari angka maksimum");
        }else {
            int randomNum = random.nextInt(max - min + 1) + 1;
            System.out.println("angka acak diantara " + min + " dan " + max + " adalah: " + randomNum);
        }
        
        
    }
    
}
