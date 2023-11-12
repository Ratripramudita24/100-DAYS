package pkg100.days;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class day35_bacaFileTxt {
    public static void main(String[] args) {
        try{
            File baru = new File("src/pkg100/days/day35file.txt");
            Scanner input = new Scanner(baru);
            while(input.hasNextLine()){
                String text = input.nextLine();
                System.out.println(text);
            }
        }catch (IOException e){
            
        }
    }
    
}
