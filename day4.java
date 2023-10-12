package pkg100.days;
public class day4 {
    public static void main(String[] args) {
        int nilai1, nilai2, nilai3;
        nilai1 = 28;
        nilai2 = 34;
        nilai3 = 2;
        
        //penjumlahan
        nilai1 += nilai2;
        System.out.println("hasil penjumlahan: "+nilai1);
        //hasil: 62 karena 28+34
        
        //perkalian
        nilai1*= nilai3;
        System.out.println("hasil perkalian: "+nilai1);
        //hasil: 124 karena 62*2
        
        //pengurangan
        nilai1-=nilai2;
        System.out.println("hasil pengurangan: "+nilai1);
        //hasil: 90 karena 124-34
        
        //sisa bagi
        nilai2 %= nilai3;
        System.out.println("hasil sisa bagi: "+nilai2);
        //hasil: 0 karena 34 : 2 sisa dari baginya 0
        
        //pembagian
        nilai1/=nilai3;
        System.out.println("hasil pembagian: "+nilai1);
        //hasil: 45 karena 90 : 2 
        
        //pengurangan
        nilai1-=nilai2;
        System.out.println("hasil pengurangan: "+nilai1);
        //hasil: 45 karena 45 - 0
        
        int angka1, angka2, angka3, angka4;
        angka1 = 2;
        angka2 = 4;
        angka3 = 3;
        angka4 = 10;
        
        //pengurangan
        angka4 -= angka3;
        System.out.println("hasil kurang: " +angka4);
        //penjumlahan
        angka1 += angka2;
        System.out.println("hasil tambah: "+ angka1);
        //sisa bagi
        angka2 %= angka3;
        System.out.println("hasil sisa bagi: " +angka2);
        //pembagian
        angka3 *= angka2;
        System.out.println("hasil kali: "+angka3);
        
    }

}
