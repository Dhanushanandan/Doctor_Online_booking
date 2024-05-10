package TestDriver;

import java.util.ArrayList;

public class Arraycopyex {
    
    public static void main(String[] args) {
        int[] sourceArray={5,7,8,9};
        int[] destinationArray=new int[2];
    
        System.arraycopy(sourceArray, 1, destinationArray, 0, 2);
        
        for(int i=0; i<destinationArray.length; i++){
            System.out.println(destinationArray[i] );
        }
        
    }
}
