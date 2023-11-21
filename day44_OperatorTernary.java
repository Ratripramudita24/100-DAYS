package pkg100.days;

public class day44_OperatorTernary {
    
    public static void main(String[] args) {
        
        boolean yakin = true;
        String hasil = yakin ? "No" : "Yes";
        System.out.println(hasil);
//        disni nilai dari yakin adalah true sehingga output yang muncul adalah No
//        namun jika nilai dari yakin adalah false maka output yang akan muncul adalah Yes
        System.out.println("=====================================");
        
        int a = 10;
        int b = 12;
        int c = (a > b) ? a : b;
        System.out.println(c);
//        jika nilai dari c bernilai true maka akan mencetak jawaban a dimana disini a bernilai 10 sehingga output yang muncul adalah 10
//        namun jika nilai dari c bernilai false maka akan mencetak jawaban b dimana b bernilai 12 sehingga output yang muncul adalah 12
        System.out.println("=====================================");
        
        int angka = 10;
        int AngkaLain = 20;
        
        if(angka %2 == 0){
            System.out.println("Merupakan angka genap");
        }else{
            System.out.println("Merupakan angka ganjil");
        }
        System.out.println((angka %2 == 0)? "Merupakan angka genap" : "Merupakan angka ganjil");
        int hasil_perbandingan = (angka > AngkaLain) ? 1 : ((angka < AngkaLain)? -1 : 0);
        System.out.println("Hasil Perbandingan adalah "+hasil_perbandingan);
    }
    
}
