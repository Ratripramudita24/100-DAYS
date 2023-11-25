package pkg100.days;

public class day48_for {
    public static void main(String[] args) {
        
        int angka = 7;
        int angka2 = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(" ");
                }
            for (int k = 1; k <= angka2; k++) {
                    System.out.print("*");
            }
            System.out.println();
            angka --;
            angka2 ++;
        }
        int angka3 = 1;
        int angka4 = 7;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= angka3; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= angka4; j++) {
                System.out.print("*");
            }
            System.out.println();
            angka3 ++;
            angka4 --;
        }
        
    }
    
}
