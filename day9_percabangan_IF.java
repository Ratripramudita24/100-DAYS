package pkg100.days;

import java.util.Scanner;

public class day9_percabangan_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int anggaran, pengeluaran;
        anggaran = 13000000;
        pengeluaran = input.nextInt();
        
        System.out.println("jumlah pengeluaran: Rp" + pengeluaran);
        System.out.println("jumlah anggaran: Rp" + anggaran);
        
        if(anggaran <= pengeluaran){
            System.out.println("terjadi defisit");
        }
    }
    
}
