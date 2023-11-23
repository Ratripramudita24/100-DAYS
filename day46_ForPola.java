package pkg100.days;

public class day46_ForPola {
    public static void main(String[] args) {
        
        int n = 5;
        int angka1 = n - 1;
        int angka2 = 1;
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= angka1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= angka2; k++) {
                System.out.print("*");
            }
            System.out.println();
            
            angka1--;
            angka2 +=2;
        }
    }
    
}
