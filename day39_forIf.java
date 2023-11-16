package pkg100.days;
public class day39_forIf {
    public static void main(String[] args) {
        System.out.println("|  *Menentukan Bilangan Prima*  |");
        System.out.println("Bilangan prima adalah bilangan bulat lebih dari 1 yang hanya memiliki 2 faktor");
        System.out.println("yaitu 1 dan bilangan itu sendiri");
        System.out.println(" ");
        for (int i = 1; i <= 100; i++) {
            if(i == 2 || i == 3 || i == 5 || i == 7 || i % i == 0 && i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0 && i != 1){
                System.out.println(i+" adalah bilangan prima **********");
            }else{
                System.out.println(i+" bukan bilangan prima");
            }
        }
    }
    
}
