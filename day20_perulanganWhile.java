package pkg100.days;
public class day20_perulanganWhile {
    public static void main(String[] args) {
     int angka = 100;
     while (angka <= 130 && angka >=70) {
         System.out.println("angka: " + angka);
         angka--;
     }if (angka > 2) {
         System.out.println("bagus");
     }else {
         System.out.println("masih harus belajar");
     }
    }
}
