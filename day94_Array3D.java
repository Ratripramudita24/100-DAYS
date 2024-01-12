package pkg100.days;

public class day94_Array3D {
    public static void main(String[] args) {
        
        int[][][] angka = new int[3][3][3];
        int jumlah = 0;
        int max = angka [0][0][0];
        int min = angka [0][0][0];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    angka[i][j][k] = (int) (Math.random() * 100);
                    System.out.println("angka["+i+"]["+j+"]["+k+"] = "+angka[i][j][k]);
                    jumlah += angka[i][j][k];
                    if(angka[i][j][k] > max){
                        max = angka[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }
        }
        System.out.println("Total angka jika dijumlahkan adalah : " + jumlah);
        System.out.println("Angka tertinggi dalam array adalah : " + max);
        
    }
    
}
