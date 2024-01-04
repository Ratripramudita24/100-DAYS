package pkg100.days;

import java.util.Arrays;

public class day86_Array2D {
    public static void main(String[] args) {
        
        int[][] array = {{12,1}, {6,-9,-5}, {-4,-3,2,0}};

        System.out.println("Isi Array : " + Arrays.deepToString(array));
        
        System.out.println("Panjang Array yaitu : " + array.length);
        
        System.out.println("Panjang array indeks ke-0 : " + array[0].length);
        
        System.out.println("Panjang array indeks ke-1 : " + array[1].length);
        
        System.out.println("Panjang array indeks ke-2 : " + array[2].length);
        
    }
    
}
