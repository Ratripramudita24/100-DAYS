package pkg100.days;

public class day47_for {
    public static void main(String[] args) {
        
        int angka1 = 1;
        int angka2 = 7;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= angka1; j++) {
                System.out.print("*");
            }
            System.out.println();
            angka1 +=2;
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= angka2; j++) {
                System.out.print("*");
            }
            System.out.println();
            angka2 -=2;
        }
            
        }
    }
    

