package pkg100.days;

public class day49_for {
    public static void main(String[] args) {
        
        int angka1 = 1;
        int angka2 = 9;
        int angka3 = 10;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= angka1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= angka2; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= angka3; j++) {
                System.out.print("*");
            }
            System.out.println();
            angka1 ++;
            angka2 --;
            angka3 --;

        }
        
    }
    
}
