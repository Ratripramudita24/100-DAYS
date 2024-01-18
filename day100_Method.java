package pkg100.days;

public class day100_Method {

    public static void main(String[] args) {
        
        String human = "Dikai";
        String human2 = "Qalby";
        int angka, angka1;
        angka = 90;
        angka1 = 55;
        char akr, akr2;
        akr = 'A';
        akr2 = 'D';
        
        hasil ("Dikai", 11);
        hasil (human2, 12);
        System.out.println();
        result (angka, akr);
        result (55, 'D');
        
    }
    static void hasil(String nama, int umur){
        System.out.println("Hello, " + nama + " Apa kabar?");
        System.out.println("Berapa usiamu tahun ini?, saya berusia " + umur + " tahun");
    }
    static void result(int nilai, char akreditasi){
        System.out.println("jika nilai sebesar " + nilai + " mendapat akreditasi " + akreditasi);
    }
    
}
