package pkg100.days;

import java.util.Scanner;

public class day76_percabangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int p,l;
        System.out.println("Masukkan luas tanah : ");
        System.out.print("Panjang : ");
        p = sc.nextInt();
        System.out.print("Lebar : ");
        l = sc.nextInt();
        int luastanah = p*l;
        System.out.println("Luas tanah = "+ luastanah + " Meter");
        
        int hargajual = luastanah * 300000;
        System.out.println("Harga jual = Rp." + hargajual); 
        int pajak = 0;
        if(hargajual >=100000000){
            System.out.println("karena harga jual diatas Rp.100.000.000 maka dikenakan pajak 5%");
            pajak = hargajual * 5 / 100;
        }else if(hargajual >= 50000000){
            System.out.println("karena harga jual diatas Rp.50.000.000 dan dibawah Rp.100.000.000 maka dikenakan pajak 3%");
            pajak = hargajual * 3 / 100;
        }else if(hargajual < 50000000){
            System.out.println("karena harga jual dibawah Rp.50.000.000 maka dikenakan pajak 1%");
            pajak = hargajual * 1 / 100;
        }
        int uangbersih = hargajual - pajak;
        System.out.println("Uang bersih yang diterima dari hasil menjual tanah sebesar Rp." + uangbersih);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Terima Kasih");
        
        
        
        sc.close();
    }
    
}
