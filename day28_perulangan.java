package pkg100.days;
public class day28_perulangan {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            for (int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < 2*i; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
     
    }
    
}
