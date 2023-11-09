package pkg100.days;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class day32_bacaFileTxt {

    public static void main(String[] args){
        try {
            File f = new File("src/pkg100/days/day32file.txt");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNextLine()){
                String text = sc.nextLine();
                System.out.println(text);
            }
        } catch (IOException e) {
            
        }
    }
    
}
