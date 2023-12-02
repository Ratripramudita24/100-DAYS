package pkg100.days;

import java.util.Arrays;

public class day55_ArrayD1 {
    public static void main(String[] args) {
        
        int[] nilaiMahasiswa = {45,78,71,89,93,58,62,63,34,78};
        System.out.println("Nilai Mahasiswa :"+Arrays.toString(nilaiMahasiswa));
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if(nilaiMahasiswa[i]>75){
                System.out.println("Selamat, kamu lulus dengan nilai "+nilaiMahasiswa[i]);
            }
        }
    }
    
}
