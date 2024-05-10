package Filehandling;

import java.io.File;
import java.util.Scanner;

public class EXScanner {
    public static void main(String[] args) {
        try{
            File f=new File("D:/mytextfile.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
            String a=sc.nextLine();
                System.out.println(a);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
