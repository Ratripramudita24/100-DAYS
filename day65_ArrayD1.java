package pkg100.days;

import java.util.Scanner;

public class day65_ArrayD1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih program yang ingin anda jalakan :");
        System.out.println("1. hitung total kesuluruhan nilai dalam array");
        System.out.println("2. hitung panjang array");
        System.out.println("3. tampilkan nilai tertinggi dalam array");
        System.out.println("4. tampilkan nilai terkecil dalam array");
        System.out.println("5. tampilkan nilai positif dalam array");
        System.out.println("6. tampilkan nilai negatif dalam array");
        System.out.print("Program yang dipilih : ");
        byte program = scan.nextByte();
        scan.close();
        byte jumlah = 0;
        int nilai[] = {6,7,-10,2,-8,-5,20};
        switch(program){
            case 1:
                for (int i = 0; i < nilai.length; i++) {
                    jumlah += nilai[i];
                }
                System.out.println("Total nilai dalam array adalah "+jumlah);
                break;
            case 2:
                System.out.println("Panjang array adalah "+nilai.length);
                break;
            case 3:
                int nilaitertinggi = nilai[0];
                for (int i = 0; i < nilai.length; i++) {
                    if(nilai[i]>nilaitertinggi){
                        nilaitertinggi = nilai[i];
                    }
                }
                System.out.println("nilai tertinggi adalah "+nilaitertinggi);
                break;
            case 4:
                int nilaiterkecil = nilai[0];
                for (int i = 0; i < nilai.length; i++) {
                    if(nilai[i]<nilaiterkecil){
                        nilaiterkecil = nilai[i];
                    }
                }
                System.out.println("Nilai terkecil dalam array adalah "+nilaiterkecil);
                break;
            case 5:
                System.out.println("Nilai positif dalam array adalah");
                for (int i = 0; i < nilai.length; i++) {
                    if(nilai[i] > 0){
                        System.out.println(nilai[i]);
                    }
                }
                break;
            case 6:
                System.out.println("Nilai negatif dalam array adalah");
                for (int i = 0; i < nilai.length; i++) {
                    if(nilai[i] < 0){
                        System.out.println(nilai[i]);
                    }
                }
                break;
            default:
                System.out.println("Input tidak valid silahkan masukkan angka 1/2/3/4/5/6 Terima kasih");
                
        }
        
        
    }
    
}
