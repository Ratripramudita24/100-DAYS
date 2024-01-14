package pkg100.days;

import java.util.Arrays;
import java.util.Scanner;

public class day96_Array4D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][][][] nilai = new int [3][1][2][3];
        int max = nilai[0][0][0][0];
        System.out.println("Masukkan nilai array : ");
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                for (int k = 0; k < nilai[i][j].length; k++) {
                    for (int l = 0; l < nilai[i][j][k].length; l++) {
                        nilai[i][j][k][l] = input.nextInt();
                        if(nilai[i][j][k][l] > max){
                            max = nilai[i][j][k][l];
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }System.out.println("isi array : " + Arrays.deepToString(nilai));
        System.out.println("Nilai tertnggi dalam array adalah : " + max);
        
    }
    
}
