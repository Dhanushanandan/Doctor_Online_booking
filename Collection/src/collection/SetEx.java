package collection;
import java.util.*;
public class SetEx {
    public static void main(String[] args) {
        Set hs=new HashSet();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(300);//do not accept duplicate values;
        
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
    }
}
