package pkg100.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day30_classBufferReader {
    public static void main(String[] args) throws IOException {
       
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
         String nama,alamat;   
         System.out.print("Masukkan nama: ");
         nama = br.readLine();
         System.out.print("Masukkan alamat: ");
         alamat = br.readLine();
         System.out.print("Masukkan umur: ");
         String stringumur = br.readLine();
         int umur = Integer.parseInt(stringumur);
         System.out.print("Masukkan tinggi badan: ");
         String stringTB = br.readLine();
         double TB = Double.parseDouble(stringTB);
         System.out.println("Nama kamu adalah " + nama +" dan kamu beralamat di "+ alamat + ", tahun ini kamu berumur "+ umur + " tahun dan tinggi kamu adalah "+ TB +" cm");
    }
    
}
