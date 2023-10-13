package pkg100.days;
public class day5 {
    public static void main(String[] args) {
        int S, P, A, T, L, r, a, b, c;
        int LP, KP, LB, KB, LS, KS, LT;
        float LL, KL;
        S = 4;   // sisi
        P = 8;   // panjang
        A = 6;   // alas
        T = 10;  // tinggi
        L = 2;   // lebar
        r = 16;    // jari-jari
        a = 2;
        b = 3;
        c = 1;
        
        LP = 2*S;   //luas persegi
        KP = 4*S;   // keliling persegi
        System.out.println("luas persegi: " + LP);
        System.out.println("keliling persegi: "+ KP);
        
        LB = P*L;   // luas persegi panjang
        KB = 2*(P+L);    // keliling persegi panjang
        System.out.println("luas persegi panjang: " + LB);
        System.out.println("keliling persegi panjang: " + KB);
        
        LS = 1*A*T/2;    //luas segitiga
        KS = a+b+c;      // keliling segitiga
        System.out.println("luas segitiga: " + LS);
        System.out.println("keliling segitiga: " + KS);
        
        LT = 1* (a+b)*T;   // luas trapesium
        System.out.println("luas trapesium: " + LT);
        
        LL = 22*r/7;     // luas lingkaran
        KL = 2*22*r/7;   //keliling lingkaran
        System.out.println("luas lingkaran: " + LL);
        System.out.println("keliling lingkaran: " + KL);
    }
    
}
