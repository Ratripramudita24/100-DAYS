package pkg100.days;

public class day81_Array2D {
    public static void main(String[] args) {
        
        int[][] nilai = {
            {65,78,90,23,75,80},
            {0,50,100,98,45,77}
        };
        
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if(nilai[i][j] > 75){
                    System.out.println("Selamat kamu nilai kamu mencukupi ketahap selanjutnya, kamu memiliki nilai " + nilai[i][j] );
                }
            }
        }
    }
    
}
