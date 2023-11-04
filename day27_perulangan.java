package pkg100.days;
public class day27_perulangan {
    public static void main(String[] args) {
        
        int i = 0;
        while (i<9) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 8 - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }
    }
    
}
