package pkg100.days;

import java.util.Arrays;

public class day66_Array2D {
    public static void main(String[] args) {
        
        System.out.println("Mencetak isi array dua dimensi dengan for");
        int angka[][] = {
            {1,5,7},
            {2,9,4}
        };
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j]+" ");
            }
        }
        System.out.println();
        
    }
    
}
