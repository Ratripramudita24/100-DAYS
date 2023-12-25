package pkg100.days;

import java.util.Scanner;

public class day78_if {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Pendapatan : ");
        int income = input.nextInt();
        System.out.print("Input jenis Pekerjaan PNS / NON-PNS: ");
        String jobType = input.next();
        int pajak = 0;
        if(jobType.equalsIgnoreCase("pns")){
            if(income >= 5000000){
                System.out.println("Kena pajak 15%");
                pajak += income * 0.15;
                
            }else if(income >= 3000000){
                System.out.println("Kena pajak 10%");
                pajak += income * 0.1;
            }
        }else{
            if(income >= 5000000){
                System.out.println("Kena Pajak 10%");
                pajak += income * 0.1;
            }else if (income >= 3000000){
                System.out.println("Kena Pajak 5%");
                pajak += income * 0.05;
            }
        }
        int netIncome = income - pajak;
        System.out.println("berdasarkan pendapatan, kamu harus bayar pajak sebesar Rp." + pajak);
        System.out.println("Pendapatan bersih sebesar Rp." + netIncome);
        
    }

    
}
