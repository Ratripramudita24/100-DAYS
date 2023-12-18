package pkg100.days;

import java.util.Arrays;

public class day71_Array2D {
    public static void main(String[] args) {
        
        String[][] data = new String[2][3];
        data[0][0] = "kamu";
        data[0][1] = "ada";
        data[0][2] = "dimana";
        data[1][0] = "saya";
        data[1][1] = "ada";
        data[1][2] = "dimanapun";
        System.out.println("Mencetak menggunakan kelas Arrays");
        System.out.println(" ");
        System.out.println(Arrays.deepToString(data));
        System.out.println(" ");
        System.out.println("Mencetak menggunakan for");
        System.out.println(" ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println("Mencetak menggunakan do while");
        int i = 0;
        do{
            int j = 0;
            do{
                System.out.print(data[i][j]+ " ");
                j++;
            }while(j < data[i].length);
            System.out.println();
            i++;
        }while(i < data.length);
        System.out.println(" ");
        System.out.println("Mencetak menggunakan while");
        int k = 0;
        while(k < data.length){
            int l = 0;
            while(l < data[k].length){
                System.out.print(data[k][l]+ " ");
                l++;
            }
            System.out.println();
            k++;
        }
    }
    
}
