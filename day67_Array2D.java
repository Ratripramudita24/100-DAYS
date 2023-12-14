package pkg100.days;

import java.util.Arrays;

public class day67_Array2D {
    public static void main(String[] args) {
        
        System.out.println("mencetak isi array dengan for-each dan kelas Arrays");
        int [][] nilai = {
            {23,11,-9,10},
            {4,13,6,0}
        };
        System.out.println("Menggunakan for-each");
        for (int [] baris : nilai) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
           
        }
        System.out.println("Menggunakan kelas Arrays");
        System.out.println(Arrays.deepToString(nilai));
        
    }
    
}
