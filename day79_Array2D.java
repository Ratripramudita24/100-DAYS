package pkg100.days;

import java.util.Arrays;

public class day79_Array2D {

    public static void main(String[] args) {
        
        int[][] nilai = new int [2][3];
        int angka = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                nilai[i][j]= angka;
                angka++;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nilai[" + i + "][" + j + "] = " + nilai[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(nilai));
        
        
    }
    
}
