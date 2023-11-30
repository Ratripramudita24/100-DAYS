package pkg100.days;

import java.util.Arrays;

public class day53_ArrayD1 {
    public static void main(String[] args) {
        
        int[] angka = {12,67,90,9,5,46};
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println(Arrays.toString(angka));
        System.out.println("Total angka jika dijumlahkan adalah :" + jumlah);
        
    }
    
}
