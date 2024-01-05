package pkg100.days;

import java.util.Arrays;
import java.util.Scanner;

public class day87_Array2D {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("| Pilih program yang ingin anda jalakan :                    |");
        System.out.println("| 1. Tampilkan total nilai dalam array                       |");
        System.out.println("| 2. Tampilkan panjang array & panjang setiap indeksnya      |");
        System.out.println("| 3. Tampilkan angka terbesar dalam array                    |");
        System.out.println("| 4. Tampilkan angka terkecil dalam array                    |");
        System.out.println("| 5. Tampilkan angka positif dalam array                     |");
        System.out.println("| 6. Tampilkan angka negatif dalam array                     |");
        System.out.println();
        System.out.print("Program yang dipilih : ");
        byte program = input.nextByte();
        input.close();
        int[][] array = {{5,-9,10,2}, {0,1,3}, {-100,99,4,8,-1}};
        switch(program){
            case 1:
                System.out.println("Isi array : " + Arrays.deepToString(array));
                int total = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        total += array[i][j];
                    }
                }
                System.out.println("Total nilai dalam Array yaitu : " + total);
                break;
            case 2:
                System.out.println("Isi array : " + Arrays.deepToString(array));
                System.out.println("Panjang array yaitu : " + array.length);
                System.out.println("Panjang array indeks ke-0 : " + array[0].length);
                System.out.println("Panjang array indeks ke-1 : " + array[1].length);
                System.out.println("Panjang array indeks ke-2 : " + array[2].length);
                break;
            case 3:
                System.out.println("Isi array : " + Arrays.deepToString(array));
                int tertinggi = array[0][0];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i][j] > tertinggi){
                            tertinggi = array[i][j];
                        }
                    }
                }
                System.out.println("Angka terbesar dalam array yaitu : " + tertinggi);
                break;
            case 4:
                System.out.println("Isi array : " + Arrays.deepToString(array));
                int terkecil = array[0][0];
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i][j] < terkecil){
                            terkecil = array[i][j];
                        }
                    }
                }
                System.out.println("Angka terkecil dalam array yaitu : " + terkecil);
                break;
            case 5:
                System.out.println("Isi array : " + Arrays.deepToString(array));
                System.out.println("Angka positif dalam array yaitu : ");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i][j] >= 0){
                            System.out.println(array[i][j]);
                        }
                    }
                }
                break;
            case 6 :
                System.out.println("Isi array : " + Arrays.deepToString(array));
                System.out.println("Angka negatif dalam array yaitu : ");
                int nilai = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if(array[i][j] < 0){
                            nilai = array[i][j];
                            System.out.println(nilai);
                        }
                    }
                }
                break;
            default:
                System.out.println("Maaf pilihan anda tidak ada dalam program kami");
                
        }
        System.out.println();
        System.out.println("|                        Terima Kasih                        |");
        
    }
    
}
