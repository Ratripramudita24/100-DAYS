package pkg100.days;
import java.util.Scanner;
import java.util.Arrays;

public class day84_Array2D {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][] angka = new int[3][3];
        System.out.println("Masukkan angka : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                angka[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(angka));
        input.close();
        System.out.println(" ");
        System.out.println("Angka positif dalam array : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if(angka[i][j] >= 0 ){
                    System.out.print(angka[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
        int angkaN = 0;
        System.out.println("Angka negatif dalam Array : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if(angka[i][j] < 0){
                    angkaN = angka[i][j];
                    System.out.print(angka[i][j] + " ");
                }
            }
        }
        
    }
    
}
