package pkg100.days;

import java.util.Arrays;
import java.util.Scanner;

public class day97_Array4D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][][][] angka = new int [2][2][2][3];
        int total = 0;
        int max = angka[0][0][0][0];
        System.out.println(" ____________________________________________________________");
        System.out.println("| Pilih program yang ingin anda jalankan :                   |");
        System.out.println("| 1. Tampilkan total nilai dalam array                       |");
        System.out.println("| 2. Tampilkan angka terbesar dalam array                    |");
        System.out.println("| 3. Tampilkan angka genap dalam array                       |");
        System.out.println("| 4. Tampilkan angka ganjil dalam array                      |");
        System.out.println("|____________________________________________________________|");
        System.out.println();
        System.out.print("Program yang dipilih : ");
        byte program = input.nextByte();
        input.close();
        System.out.println("Isi array : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                for (int k = 0; k < angka[i][j].length; k++) {
                    for (int l = 0; l < angka[i][j][k].length; l++) {
                        angka[i][j][k][l] = (int)(Math.random() * 30);
                        total += angka[i][j][k][l];
                        if(angka[i][j][k][l] > max){
                            max = angka[i][j][k][l];
                        }
                        System.out.println("Angka ["+i+"]["+j+"]["+k+"]["+l+"] = " + angka[i][j][k][l]);
                        
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        switch(program){
            case 1:
                System.out.println("Total nilai dalam Array yaitu : " + total);
                break;
            case 2:
                System.out.print("Angka terbesar dalam array adalah : " + max);
                break;
            case 3:
                System.out.println("Angka genap dalam array adalah : ");
                int genap = 0;
                for (int i = 0; i < angka.length; i++) {
                    for (int j = 0; j < angka[i].length; j++) {
                        for (int k = 0; k < angka[i][j].length; k++) {
                            for (int l = 0; l < angka[i][j][k].length; l++) {
                                if(angka[i][j][k][l] % 2 == 0){
                                    genap++;
                                    System.out.println(angka[i][j][k][l]);
                                }
                            }
                        }
                    }
                }System.out.println("Jumlah angka genap yang terdapat dalam array yaitu : " + genap + " angka");
                break;
            case 4:
                System.out.println("Angka ganjil dalam array adalah : ");
                int ganjil = 0;
                for (int i = 0; i < angka.length; i++) {
                    for (int j = 0; j < angka[i].length; j++) {
                        for (int k = 0; k < angka[i][j].length; k++) {
                            for (int l = 0; l < angka[i][j][k].length; l++) {
                                if(angka[i][j][k][l] % 2 == 1){
                                    ganjil++;
                                    System.out.println(angka[i][j][k][l]);
                                }
                            }
                        }
                    }
                }System.out.println("jumlah angka ganjil yang terdapat dalam array yaitu : " + ganjil + " angka");
                break;
            default:
                System.out.println("Maaf kami tidak memiliki program yang anda pilih");
        }
        System.out.println();
        System.out.println("|                        Terima kasih                        |");
    }
    
}
