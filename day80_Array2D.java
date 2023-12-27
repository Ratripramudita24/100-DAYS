package pkg100.days;

import java.util.Arrays;

public class day80_Array2D {

    public static void main(String[] args) {
        
        int[][] nilai = new int [3][3];
        int angka, jumlah;
        angka = 1;
        jumlah = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nilai[i][j] = angka;
                angka++;
                jumlah+=nilai[i][j];
            }
        }
        System.out.println(Arrays.deepToString(nilai));
        System.out.println("Total keseluruhan angka jika dijumlahkan yaitu : " + jumlah);
        
    }
    
}
