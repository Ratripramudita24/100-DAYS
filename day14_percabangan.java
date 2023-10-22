package pkg100.days;
import java.util.Scanner;
public class day14_percabangan {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Menghitung IMT berdasarkan gender");
        System.out.println("----------------------------------");
        
        System.out.println("nama: ");
        String nama = input.nextLine();
        
        char gender;
        System.out.println("masukkan gender (P/L): ");
        gender = input.next().charAt(0);
        //dalam memasukkan gender harap masukkan satu karakter saja dengan menggunakan huruf kapital
        //L untuk laki-laki
        //P untuk perempuan
        
        System.out.println("Berat Badan(kg): ");
        int BB = input.nextInt();   // BB singkatan dari berat badan
        //masukkan berat badan dalam satuan kilogram dan juga harus dalam bilangan bulat
        
        System.out.println("Tinggi Badan(m): ");
        double TB = input.nextDouble();  //TB singkatan dari tinggi badan
        //masukka tinggi badan dengan satuan meter dan dalam bentuk desimal
        //penulisan desimal tidak menggunakan tanda koma(,) melainkan tanda titik(.)
        //conotoh TB: 150 cm = 1.5 m atau TB 200 cm = 2.0 m
        
        //rumus menghitung imt atau indeks massa tubuh
        double imt = BB / (TB*TB);
        
        if(gender == 'P' && imt <= 17) {
            System.out.println("berat badan kurang ideal");
        }else if(gender == 'P' && imt >= 17 && imt <23) {
            System.out.println("berat badan normal dan ideal");
        }else if(gender == 'P' && imt >=23 && imt <=27) {
            System.out.println("kelebihan berat badan");
        }else if (gender == 'P' && imt > 27) {
            System.out.println("obesitas");
        }else if (gender == 'L' && imt < 18.5) {
            System.out.println("berat badan kurang ideal");
        }else if (gender == 'L' && imt >= 18.5 && imt <= 23.9) {
            System.out.println("berat badan normal dan ideal");
        }else if (gender == 'L' && imt >= 23 && imt <= 29.9) {
            System.out.println("kelebihan berat badan");
        }else if (gender == 'L' && imt >= 30) {
            System.out.println("obesitas");
        }System.out.println("Terima Kasih");
    
}
}