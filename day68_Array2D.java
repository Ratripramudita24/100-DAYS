package pkg100.days;

public class day68_Array2D {
    public static void main(String[] args) {
        
        String[][] nama = {
            {"Ratri","Ija","Dikai"},
            {"Diput","Kolby","Nopa"}
        };
        for (int i = 0; i < nama.length;i++) {
            for (int j = 0; j < nama[i].length;j++) {
                System.out.println(nama[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
