package pkg100.days;

import java.util.Scanner;

public class day75_while {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        while(true){
            if(angka % 2 == 0){
                System.out.println("genap");
                System.out.print("Masukkan ulang angka : ");
                angka = sc.nextInt();
            }else if(angka % 2 == 1){
                System.out.println("you and i, end");
                break;
            }
        }
        
    }
    
}
