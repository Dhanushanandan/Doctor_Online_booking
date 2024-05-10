package collection;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList li=new ArrayList();
        li.add("Kamal");
        li.add("Amal");
        li.add("Kamal");
        li.add(100);
        
        Iterator itr=li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        //GENERIC
        List<Integer> li = new ArrayList();
        //li.add("Kamal");  cannot add a string value into integer type;
        //li.add("Amal");
        //li.add("Kamal");
        li.add(100);

        Iterator itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
