package pkg100.days;

import java.util.HashMap;

public class day91_ClassHashMap {
    public static void main(String[] args) {
        
        HashMap <Character, Integer> jawaban = new HashMap <Character, Integer>();
        jawaban.put('a', 245);
        jawaban.put('b', 987);
        jawaban.put('c', 3695);
        jawaban.put('c', 24);
        jawaban.put('d', 910);
        jawaban.put('e', 1);
        
        System.out.println("Pilihan jawaban yaitu : " + jawaban);
        System.out.println("Jawaban yang benar adalah " + jawaban.get('c'));
        System.out.println();
        
        HashMap <Integer, String> bulan = new HashMap <Integer, String>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "March");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
        bulan.put(13, "Tidak ada");
        bulan.remove(13);
        
        System.out.println("Bulan dalam satu tahun terdiri dari : " + bulan);
        
        System.out.println("Bulan kelahiran saya yaitu : " + bulan.get(3));
        
        bulan.replace(3, "March", "Maret");
        System.out.println("Nama-nama bulan adalah : " + bulan);
        
    }
    
}
