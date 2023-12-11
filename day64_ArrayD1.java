package pkg100.days;

public class day64_ArrayD1 {
    public static void main(String[] args) {
        
        byte nilai[] = {5,2,-9,8,-10,4,-1,-7};
        int count = 0;
        System.out.println("nilai positif dalam array yaitu :");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i]>0){
                System.out.println(nilai[i]);
            }
        }
        System.out.println("nilai negatif dalam array yaitu :");
        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] < 0){
                System.out.println(nilai[i]);
            }
        }
        
        
    }
    
}
