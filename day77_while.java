package pkg100.days;

public class day77_while {
    public static void main(String[] args) {
        
        int hargakomputer, gajipokok, bayarkost, maxtabunganperbulan ,kebutuhanharian, totalpengeluaran, bulan, tabungan;
        hargakomputer = 55000000;
        gajipokok = 5000000;
        bayarkost = 750000;
        maxtabunganperbulan = 1500000;
        kebutuhanharian = gajipokok - bayarkost - maxtabunganperbulan;
        totalpengeluaran = bayarkost + kebutuhanharian;
        bulan = 0;
        tabungan = 0;
        
        while(tabungan < hargakomputer){
            tabungan += gajipokok;
            tabungan -= totalpengeluaran;
            bulan++;
        }
        System.out.println("Dilan harus menabung selama " + bulan + " bulan, untuk membeli laptop sultan");
        
        System.out.println("Total tabungan yang akan dimiliki Dilan sebesar Rp." + tabungan + " dalam " + bulan + " bulan");
        
    }
    
}
