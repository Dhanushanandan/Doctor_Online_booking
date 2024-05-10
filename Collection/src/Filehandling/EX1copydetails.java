package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX1copydetails {
    public static void main(String[] args) {
        try{
            File ob1=new File("D:/output.txt");
            if(ob1.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File already excist");
            }
            
            byte []array=new byte[1000];
            
            InputStream input=new FileInputStream("D:/mytextfile.txt");
            input.read(array);
            String data=new String(array);
            
            OutputStream out=new FileOutputStream("D:/output.txt");
            byte[] databyte=data.getBytes();
            out.write(databyte);
            System.out.println("Data Added");
            out.close();
            
        }catch(IOException ex){
            System.out.println(ex);
        }
       
    }
}
