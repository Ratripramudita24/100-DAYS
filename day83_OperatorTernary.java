package pkg100.days;
import java.util.Scanner;

public class day83_OperatorTernary {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka1 : ");
        int angka1 = input.nextInt();
        
        System.out.println("Masukkan angka2 : ");
        int angka2 = input.nextInt();
        
        input.close();
        int nilai_tertinggi = (angka1 > angka2 ) ? angka1 : angka2;
        System.out.println("Angka tertinggi adalah " + nilai_tertinggi);
        
        
        
    }
    
}
