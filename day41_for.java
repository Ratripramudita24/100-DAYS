package pkg100.days;
public class day41_for {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {
            if(i%2 == 0){
                if(i < 31){
                    System.out.println(i + " adalah nilai genap yang lebih kecil dari 30");
                }else{
                    System.out.println(i +" adalah nilai genap yang lebih besar dari 30");
                }
            }else if(i % 2 == 1){
                if(i < 31){
                    System.out.println(i + " adalah nilai ganjil yang lebih kecil dari 30");
                }else{
                    System.out.println(i + " adalah nilai ganjil yang lebih besar dari 30");
                }
            }
        }
    }
    
}
