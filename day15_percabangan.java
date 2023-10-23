package pkg100.days;
import java.util.Scanner;
public class day15_percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //dikususkan untuk wanita
        System.out.println("Cek usia ideal peernikahan berdasarkan resiko kehamilan");
        
        System.out.println("Nama: ");
        String nama = input.nextLine();
        System.out.println("Gender (P/p)");
        char gender = input.next().charAt(0);
        System.out.println("Tahun Lahir: ");
        int tahun_lahir = input.nextInt();
        System.out.println("Tahun saat ini: ");
        int tahun_saat_ini = input.nextInt();
        
        int hasil = tahun_saat_ini - tahun_lahir;
        
        System.out.println("-------------------");
        if(gender == 'P' || gender == 'p' && hasil <= 18) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko kehamilan tinggi!!!!");
        }else if (gender == 'P' || gender == 'p' && hasil >= 20) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko tergolong sedang, kemungkinan hamil 80%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 25) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko masih rendah, kemungkinan kehamilan positif 70%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 28) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko masih rendah, kemungkinan kehamilan positif 50%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 31) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko mulai tinggi, kemungkinan kehamilan postiif 30%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 33) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko tinggi, kemungkinan kehamilan positif 10% ");
        }else if (gender == 'P' || gender == 'p' && hasil >= 35) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko tinggi, kemungkinan kehamilan positif 5%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 37) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko sangat tinggi, kemungkinan kehamilan 3%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 39) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko sangat tinggi, kemungkinan gangguan pada kesehatan tinggi, tingkat kehamilan 1%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 41) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko sangat tinggi, kemungkinan gangguan pada kesehatan tinggi, tingkat kehamilan 0.3%");
        }else if (gender == 'P' || gender == 'p' && hasil >= 47) {
            System.out.println("usia anda "+hasil+ " tahun "+"resiko sangat tinggi, besar membahayakan ibu dan bayi");
        }else {
            System.out.println("gender tidak diketahui");
        }
        
    }
    
}
