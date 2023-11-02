package pkg100.days;

import java.util.Scanner;

public class day25_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("|===============================|");
        System.out.println("| Program Mesin Kasir Sederhana |");
        System.out.println("|===============================|");
        System.out.println("|     * Pilih Menu Makanan *    |");
        System.out.println("|===============================|");
        System.out.println("| 1. Nasi Goreng      Rp. 18.000|");
        System.out.println("| 2. Ayam Geprek      Rp. 12.000|");
        System.out.println("| 3. Stepang          Rp. 16.000|");
        System.out.println("| 4. Pangsit          Rp. 15.000|");
        System.out.println("|===============================|");
        
        System.out.print("Menu makanan (1/2/3/4) : ");
        int Menu_Makanan = input.nextInt();
        System.out.print("Jumlah Porsi         : ");
        int Porsi_Makanan = input.nextInt();
        
        switch (Menu_Makanan) {
            case 1:
                System.out.println("Nasi Goreng " + Porsi_Makanan + " porsi = Rp. " + Porsi_Makanan*18000);
                break;
            case 2:
                System.out.println("Ayam Geprek " + Porsi_Makanan + " Porsi = Rp. " + Porsi_Makanan*12000);
                break;
            case 3:
                System.out.println("Stepang " + Porsi_Makanan + " Porsi = Rp. " + Porsi_Makanan*16000);
                break;
            case 4:
                System.out.println("Pangsit " + Porsi_Makanan + " Porsi = Rp. " + Porsi_Makanan*15000);
                break;
            default:
                System.out.println("Mohon Maaf Kami Tidak Memiliki Menu Tersebut");
        }System.out.println("       ");
        System.out.println("|===============================|");
        System.out.println("|     * Pilih Menu Minuman *    |");
        System.out.println("|===============================|");
        System.out.println("| 1. Es Teh            Rp. 7.000|");
        System.out.println("| 2. Pop Ice           Rp. 5.000|");
        System.out.println("| 3. Es Jeruk         Rp. 10.000|");
        System.out.println("|===============================|");
        
        System.out.print("Menu Minuman (1/2/3) : ");
        int Menu_Minuman = input.nextInt();
        System.out.print("Jumlah Gelas : ");
        int Jumlah_Gelas = input.nextInt();
        
        switch (Jumlah_Gelas) {
            case 1:
                System.out.println("Es Teh " + Jumlah_Gelas + " Gelas = Rp. " + Jumlah_Gelas*7000);
                break;
            case 2:
                System.out.println("Pop Ice " + Jumlah_Gelas + " Gelas = Rp. " + Jumlah_Gelas*5000);
                break;
            case 3:
                System.out.println("Es Jeruk " + Jumlah_Gelas + " Gelas = Rp. " + Jumlah_Gelas*10000);
                break;
            default :
                System.out.println("Mohon Maaf Kami Tidak Memiliki Menu Tersebut");
        }System.out.println("  ");
        System.out.println("|===============================|");
        System.out.println("|        ~ Terima Kasih ~       |");
        System.out.println("|===============================|");
    }
    
}
