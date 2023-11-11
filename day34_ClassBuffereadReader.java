package pkg100.days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day34_ClassBuffereadReader {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader f = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader (f);
        
        System.out.println("Masukkkan Biodata Diri");
        
        String nama,alamat,univ,fakultas,prodi,kelas;
        System.out.print("Nama : ");
        nama = s.readLine();
        System.out.print("Alamat : ");
        alamat = s.readLine();
        System.out.print("Universitas : ");
        univ = s.readLine();
        System.out.print("Fakultas : ");
        fakultas = s.readLine();
        System.out.print("Program Studi : ");
        prodi = s.readLine();
        System.out.print("Kelas : ");
        kelas = s.readLine();
        System.out.print("Tinggi badan : ");
        String TB1 = s.readLine();
        double TB = Double.parseDouble(TB1);
        System.out.print("Berat Badan : ");
        String BB1 = s.readLine();
        int BB = Integer.parseInt(BB1);    
    }
    
}
