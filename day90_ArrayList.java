package pkg100.days;

import java.util.ArrayList;

public class day90_ArrayList {
    public static void main(String[] args) {
        
        ArrayList <Integer> angka = new ArrayList<>();
        angka.add(05);
        angka.add(03);
        angka.add(2004);
        
        for (int i = 0; i < angka.size(); i++) {
            System.out.println("Angka pada indeks ke " + i + " : " + angka.get(i));
        }
        System.out.println();
        ArrayList <String> nama = new ArrayList<>();
        nama.add("Ratri");
        nama.add("Dikai");
        nama.add("Nilam");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nama : " + nama.get(i));
        }
        System.out.println();
        ArrayList <Character> akreditasi = new ArrayList<>();
        akreditasi.add('A');
        akreditasi.add('5');
        akreditasi.add('#');
        for (int i = 0; i < akreditasi.size(); i++) {
            System.out.println("Akreditasi terdaftar yaitu : " + akreditasi.get(i));
        }
        System.out.println();
        ArrayList <Double> nilai = new ArrayList<>();
        nilai.add(12.9);
        nilai.add(5.987);
        nilai.add(5.0);
        for (int i = 0; i < nilai.size(); i++) {
            System.out.println("Nilai yang dimiliki yaitu " + nilai.get(i) + " N");
        }
        
    }
    
}
