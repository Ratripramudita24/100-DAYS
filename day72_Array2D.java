package pkg100.days;

import java.util.Arrays;
import java.util.Scanner;

public class day72_Array2D {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][] nilai = new int [2][2];
        System.out.println("Input nilai array");
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                nilai[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(nilai));
        
    }
    
}
