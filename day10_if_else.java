package pkg100.days;

import java.util.Scanner;

public class day10_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pendapatan, pengeluaran;
        
        pendapatan = input.nextInt();
        pengeluaran = input.nextInt();
        
        System.out.println("pendapatan = Rp." + pendapatan);
        System.out.println("pengeluaran = Rp." + pengeluaran);
        
        if(pengeluaran >= pendapatan) {
            System.out.println("terjadi devisit");
        } else {
            System.out.println("tidak terjadi devisit");
        }
    }
}
