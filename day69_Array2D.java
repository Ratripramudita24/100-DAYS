package pkg100.days;

public class day69_Array2D {
    public static void main(String[] args) {
        
        System.out.println("Mencetak isi array dengan do whlie");
        int [][] angka = {
            {12,-10,5,7,-9,-5,-1,0},
            {1,6,3,-15}
        };
        int i = 0;
        do{
            int j = 0;
            do{
                System.out.print(angka[i][j]+" ");
                j++;
            }while(j < angka[i].length);
            System.out.println();
            i++;
        }while(i < angka.length);
        
    }
    
}
