package pkg100.days;

public class day70_Array2D {
    public static void main(String[] args) {
        
        System.out.println("Mencetak isi array dengan while");
        System.out.println("1.menggunakan tipe data integer");
        int nilai [][] = {
            {12,7,8,-9,-7,-1},
            {34,7,1,-4,-2}
        };
        int i = 0;
        while(i < nilai.length){
            int j = 0;
            while(j < nilai[i].length){
                System.out.print(nilai[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("=========================================");
        System.out.println("2. menggunakan tipe data char");
        char[][] abjad = {
            {'A','B','C'},
            {'X','Y','Z'}
        };
        int k = 0;
        while(k < abjad.length){
            int m = 0;
            while(m < abjad[k].length){
                System.out.println(abjad[k][m]);
                m++;
            }
            System.out.println();
            k++;
        }
    }
    
}
