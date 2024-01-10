package pkg100.days;

import java.util.Arrays;

public class day92_Array3D {
    public static void main(String[] args) {
        
        int[][][] array = new int [4][3][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = (int)(Math.random() * 20);
                }
            }
        }
        System.out.println("Isi array : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println(array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
        
        
    }
    
}
