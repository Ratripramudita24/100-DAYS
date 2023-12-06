package pkg100.days;

public class day59_PerulanganWhile {
    public static void main(String[] args) {
        
        int i = 0;
        while(true){
            if (i%2 == 0 && i < 10){
                System.out.print(i);
            }else if (i == 5){
                break;
            }
            i++;
        }
        
    }
    
}
