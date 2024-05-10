package Filehandling;

import java.io.FileInputStream;
import java.io.InputStream;

public class readcontent {
    public static void main(String[] args) {
        byte []array=new byte[100];
        try{
            InputStream input=new FileInputStream("D:/mytextfile.txt");
            System.out.println(input.available());
            char a=(char)input.read();
            System.out.println(a);
            input.read(array);
            String data=new String(array);
            System.out.println(data);
            input.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
