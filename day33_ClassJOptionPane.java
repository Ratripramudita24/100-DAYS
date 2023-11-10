package pkg100.days;

import javax.swing.JOptionPane;

public class day33_ClassJOptionPane {
    public static void main(String[] args) {
        
        String Alamat;
        
        Alamat = JOptionPane.showInputDialog("input alamat anda: ");
        String pesan = "Kamu tinggal di " + Alamat + ", alamat kamu akan segera ditambahkan dalam biodata";
        JOptionPane.showMessageDialog(null, pesan);
                
    }
}
