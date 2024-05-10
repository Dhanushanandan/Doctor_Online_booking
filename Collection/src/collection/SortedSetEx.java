package collection;
import java.util.*;
public class SortedSetEx {
    public static void main(String[] args) {
        SortedSet hs=new TreeSet();
        hs.add("Amal");
        hs.add("Sunil");
        hs.add("Ben");
        //do not accept duplicate values;
        
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
    }
}
