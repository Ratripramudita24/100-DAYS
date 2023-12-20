package pkg100.days;

import java.util.Scanner;

public class day73_perulangan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int min,maks,jumlah;
        System.out.print("Masukkan nilai minimum : ");
        min = sc.nextInt();
        System.out.print("Masukkan nilai maksimum : ");
        maks = sc.nextInt();
        jumlah = 0;
        for (int i = min; i <= maks; i++) {
            jumlah += i;
            System.out.print(i);
            if( i < maks){
                System.out.print("+");
            }
        }
        System.out.print("="+jumlah);
        
    }
    
}
