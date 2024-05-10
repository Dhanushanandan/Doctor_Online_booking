package collection;
import java.util.*;
public class Stackex {
    public static void main(String[] args) {
        /*Stack stk=new Stack();
        stk.push("Amal");
        stk.push("Kamal");
        stk.push("Sunil");
        
        stk.pop(); //remove the last object
        Iterator itr=stk.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
                
            Queue que=new PriorityQueue();
            que.add(100);
            que.add(200);
            que.add(300);
            
            que.remove();//remove the last object
        
        
        Iterator itr=que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } 
    }
}
