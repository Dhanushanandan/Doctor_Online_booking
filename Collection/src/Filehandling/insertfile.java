package Filehandling;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class insertfile {
    public static void main(String[] args) {
        String data="NIBM KANDY SRILANKA2";
        
       try{
            OutputStream out=new FileOutputStream("D:/mytextfile.txt");
            byte[] databyte=data.getBytes();
            out.write(databyte);
            System.out.println("Data Added");
            out.close();
            
            //easy way do not use in exam
            /* FileWriter f=new FileWriter("file path");
                f.write("value.....");
            */
            
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
}
