package pkg100.days;
import java.util.Scanner;
public class day12_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int gaji, PTKP, PKP;
        PTKP = 54000000;    //pendapatan tidak kena pajak
        System.out.println("gaji: ");
        gaji = input.nextInt();
        gaji *= 12;
        if(gaji <= 50000000){
            System.out.println("kena pajak 5%");
        }else if (gaji > 250000000) {
            System.out.println("kena pajak 25%");
        } else {
            System.out.println("kena pajak 15%");
        }
        PKP = gaji - PTKP;  //pkp(penghasilan kena pajak)
        System.out.println("PKP: Rp." + PKP);
    }
    
}
