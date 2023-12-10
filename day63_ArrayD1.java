package pkg100.days;

import java.util.Arrays;

public class day63_ArrayD1 {
    public static void main(String[] args) {
        
        int nilai[] = {3,6,1,45,-8};
        System.out.println(Arrays.toString(nilai));
        
        int nilaitertinggi = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i]>nilai.length){
                nilaitertinggi = nilai[i];
            }
        }
            System.out.println("Nilai tertinggi dalam array adalah "+ nilaitertinggi);
        int nilaiterkecil = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i]< nilai.length){
                nilaiterkecil = nilai[i];
            }
        }
            System.out.println("Nilai terkecil dalam array adalah "+ nilaiterkecil);
        
    }
    
}
