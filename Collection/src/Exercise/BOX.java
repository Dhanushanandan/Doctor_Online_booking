package Exercise;
import java.util.*;
public class BOX<T> {
    
    T x;
    public void add(T x){
        this.x=x;
    }
    public T get(){
        return x;
    }
    public static void main(String[] args) {
        BOX b=new BOX();
        b.add(10);
        System.out.println(b.get());
        
        BOX b1=new BOX();
        b1.add("Hello");
        System.out.println(b1.get());
        
        BOX b2=new BOX();
        b2.add(10.5);
        System.out.println(b2.get());
    }
}
