package pkg100.days;
public class day23_perulangan {
    public static void main(String[] args) {
        for (int i = 15; i > 0; i--) {
            System.out.println("nilai i : " + i);
        }
        System.out.println("--------------------");
        
        for (int y = 5; y < 10; ++y) {
            System.out.println("nilai y : " + y);
            
        }
        System.out.println("--------------------");
        int angka = 2;
        for (int a = 2; a < 20; a+=2) {
            System.out.println("nilai a : " + (a/angka));
            
        }
    }
    
}
