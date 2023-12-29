package pkg100.days;

public class day82_Array2D {
    public static void main(String[] args) {
        
        int[][] angka = {
            {12,0,-34,2,-9,-10},
            {7,-6,-12,9,4},
            {11,-5,3,-11}
        };
        System.out.println("Angka genap dalam array yaitu : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if(angka[i][j] % 2 == 0){
                    System.out.print(angka[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Angka ganjil dalam array yaitu : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if(angka[i][j] % 2 != 0){
                    System.out.print(angka[i][j] + " ");
                }
            }
        }
        
    }
    
}
