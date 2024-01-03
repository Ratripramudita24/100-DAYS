package pkg100.days;

import java.util.Arrays;

public class day85_Array2D {
    
    public static void main(String[] args) {
        
        int[][] angka = {{12,0,-100}, {10,97,-12}, {-90,-1,-8}};
        int terkecil = angka[0][0];
        int terbesar = angka[0][0];
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if ( angka[i][j] < terkecil ) {
                    terkecil = angka[i][j];
                }else if( angka[i][j] > terbesar ) {
                    terbesar = angka[i][j];
                }
            }
            
        }
        System.out.println(Arrays.deepToString(angka));
        System.out.println("Angka terkecil dalam array yaitu " + terkecil);
        System.out.println("Angka terbesar dalam array yaitu " + terbesar);
        
    }
    
}
