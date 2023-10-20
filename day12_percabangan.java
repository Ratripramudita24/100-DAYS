package pkg100.days;
import java.util.Scanner;
public class day12_percabangan {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gaji, PTKP, PKP;
        PTKP = 54000000;   //pendapatan tidak kena pajak(PTKP)
        System.out.println("gaji: ");
        gaji = input.nextInt();  //gaji perbulan
        gaji *= 12;   //gaji per-bulan dikali 12 bulan
        
        if(gaji <= 50000000){
            System.out.println("kena pajak 5%");
        }else if (gaji > 250000000) {
            System.out.println("kena pajak 25%");
        } else {
            System.out.println("kena pajak 15%");
        }
        PKP = gaji - PTKP;  //penghasilan kena pajak (PKP)
        System.out.println("PKP: Rp." + PKP);
    }
    
}
