package pkg100.days;

public class day95_Array4D {
    public static void main(String[] args) {
        
        int[][][][] arr = new int[2][2][3][4];
        int jumlah = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        arr[i][j][k][l] = (int)(Math.random() * 15);
                        jumlah += arr[i][j][k][l];
                        System.out.println("Arr ["+i+"]["+j+"]["+k+"]["+l+"] = " + arr[i][j][k][l]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("Total angka dalam array jika dijumlahkan adalah " + jumlah);
        
    }
    
}
