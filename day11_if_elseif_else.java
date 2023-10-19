package pkg100.days;
import java.util.Scanner;
public class day11_if_elseif_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int belanja, uang_tunai;
        
        System.out.println("total belanjaan: ");
        belanja = input.nextInt();
        System.out.println("uang tunai yang sedang dimiliki: ");
        uang_tunai = input.nextInt();
        
        if (belanja < uang_tunai ) {
        System.out.println("tidak melebihi anggaran, bayar secara tunai");
    } else if (belanja > 120000) {
            System.out.println("kamu melebihi anggaran");
    } else {
            System.out.println("bayar menggunakan kartu debit");
    }
    }
    
}
