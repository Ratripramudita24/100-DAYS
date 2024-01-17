package pkg100.days;

public class day99_Method {
    String nama;
    String nim;
    char kelas;
    byte absen;
    
    void hasil(){
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("kelas : " + kelas);
        System.out.println("nomor absen : " + absen);
    }
    void results(){
        System.out.println(nama + " berangkat sekolah pukul 06.30");
        System.out.println("kelas informatika " + kelas + " berada dilorong dua");
        System.out.println(nama + " duduk dibangku nomor " + absen + " sesuai dengan absennya");
        System.out.println();
    }
    public static void main(String[] args) {
        day99_Method mahasiswa = new day99_Method();
        
        mahasiswa.nama = "Ratri Pramudita";
        mahasiswa.nim = "D0223321";
        mahasiswa.kelas = 'B';
        mahasiswa.absen = 19;
        mahasiswa.hasil();
        mahasiswa.results();
        
        day99_Method mahasiswa1 = new day99_Method();
        mahasiswa1.nama = "Zhang Lurang";
        mahasiswa1.nim = "Z02D346";
        mahasiswa1.kelas = '3';
        mahasiswa1.absen = 12;
        mahasiswa1.hasil();
        mahasiswa1.results();
        
    }
    
}
