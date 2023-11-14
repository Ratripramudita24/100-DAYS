package pkg100.days;

import java.util.Scanner;

public class day37_DoWhile {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int angka;
       do{
           System.err.println("Masukkan angka : ");
           angka = input.nextInt();
           if(angka<0){
               System.out.println("kamu memasukkan angka bermuatan negatif");
           }else if (angka>0){
               System.out.println("kamu memasukkan angka bermuatan positif");
           }else{
               System.out.println("berhenti memasukkan angka");
           }
       }while (angka != 13);
               System.out.println("_-_");
    }
}