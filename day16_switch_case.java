package pkg100.days;
import java.util.Scanner;
public class day16_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Silahkan Mencoba Program Ini");
        System.out.println(" - - - - - - - - - - - - - -");
        
        System.out.println("Masukkan bulan");
        int bulan = input.nextInt();
        
        switch (bulan) {
            case 1:
                System.out.println("bulan ke "+bulan+" adalah bulan januari");
//                break;
            case 2: 
                System.out.println("bulan ke "+bulan+" adalah bulan februari");
//                break;
            case 3:
                System.out.println("bulan ke "+bulan+" adalah bulan maret");
                break;
            case 4:
                System.out.println("bulan ke "+bulan+" adalah bulan april");
                break;
            case 5:
                System.out.println("bulan ke "+bulan+" adalah bulan mei");
                break;
            case 6:
                System.out.println("bulan ke "+bulan+" adalah bulan juni");
                break;
            case 7:
                System.out.println("bulan ke "+bulan+" adalah bulan juli");
                break;
            case 8:
                System.out.println("bulan ke "+bulan+" adalah bulan agustus");
                break;
            case 9:
                System.out.println("bulan ke "+bulan+" adalah bulan september");
                break;
            case 10:
                System.out.println("bulan ke "+bulan+" adalah bulan oktober");
                break;
            case 11:
                System.out.println("bulan ke "+bulan+" adalah bulan november");
                break;
            case 12:
                System.out.println("bulan ke "+bulan+" adalah bulan desember");
                break;
            default :
                System.out.println("bulan ke "+bulan+" bulan tidak diketahui");
        }System.out.println(" - - - - - - - - - - - - - - - - - - - - - "); 
        System.out.println("Terima Kasih Telah Menggunakan Program Ini");
        
    }
    
}
