package pkg100.days;
public class day29_perulangan {
    public static void main(String[] args) {
        
        int i = 1;
        while(i < 9){
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            }
           // System.out.println(" ");
            for (int j = 1; j < 10-i; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }
    
}
