package pkg100.days;

import javax.swing.JOptionPane;

public class day36_ClassJOptionPane {
    public static void main(String[] args) {
        
//        int umur;
        String umur;
        
        umur = JOptionPane.showInputDialog("input umur");
        String message = "Sekarang kamu berumur " + umur + " Tahun";
        
        JOptionPane.showMessageDialog(null, message);
        
    }
    
}
