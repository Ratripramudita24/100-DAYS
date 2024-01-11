package pkg100.days;

import java.util.Arrays;

public class day93_Array3D {
    public static void main(String[] args) {
        
        int[][][] nilai = {
            {
                {1,4,7},
                {2,0},
                {10,-2,8,1}
            },
            {
                {-9,8,9},
                {45,0,7,5},
            },
            {
                {99,-100,4},
                {34,9,13},
                {11,10,17,21}
            }
        };
        int jumlah = 0;
//        Mencetak isi array menggunakan for
        System.out.println("Isi array yang akan ditampilkan sebagai berikut");
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                for (int k = 0; k < nilai[i][j].length; k++) {
                    jumlah += nilai[i][j][k];
                    System.out.println("Nilai [" + i + "][" + j + "][" + k + "] = " + nilai[i][j][k]);
                }
                System.out.println();
            }
        }
        System.out.println("Total nilai yang terdapat didalam array jika dijumlahkan adalah " + jumlah);
        System.out.println("Mencetak isi array menggunakan kelas arrays");
        System.out.println(Arrays.deepToString(nilai));
        System.out.println("Panjang array adalah " + nilai.length);
    }
    
}
