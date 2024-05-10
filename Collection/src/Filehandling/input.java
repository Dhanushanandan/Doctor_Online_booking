package Filehandling;

import java.io.FileInputStream;
import java.io.InputStream;

public class input {
    public static void main(String[] args) {
        try{
            InputStream input=new FileInputStream("D:/mytextfile.txt");
            System.out.println(input.available());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
