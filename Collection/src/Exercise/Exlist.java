package Exercise;
import java.util.*;
public class Exlist {
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList();
        li.add(1000);
        li.add(100);
        li.add(300);
       // li.add("NIBM");   cannot add a string value to the integer type find the compile time error
        
        int a=Integer.parseInt(li.get(0).toString());
    }
}
