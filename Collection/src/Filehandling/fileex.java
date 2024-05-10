package Filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class fileex {
    public static void main(String[] args) {
        
        //create new file
        try{
            File ob1=new File("D:/mytextfile.txt");
            if(ob1.createNewFile()){
                System.out.println("File Created");
            }else{
                System.out.println("File already excist");
            }
        }catch(IOException ex){
            System.out.println(ex);
        }
       
       
       
  
    }
}
