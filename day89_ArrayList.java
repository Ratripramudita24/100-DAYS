package pkg100.days;

import java.util.ArrayList;

public class day89_ArrayList {

    public static void main(String[] args) {

        ArrayList info = new ArrayList();
        info.add("Ratri");
        info.add("Kelas " + 'B');
        info.add("Angkatan " + 23);
        info.add('2');
        info.add(7.01);
        info.add(24);
        info.add(20.15 + " PM");

        System.out.println("Isi array adalah : ");
        System.out.println(info);
        System.out.println();
        System.out.println("Array memuat " + info.size() + " Informasi");
        System.out.println("Array memiliki ukuran " + info.size());

    }

}
