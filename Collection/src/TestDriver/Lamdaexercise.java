package TestDriver;

import java.util.ArrayList;

@FunctionalInterface
        
interface A{
    /*Exercise 1
    void m(int a,int b);*/
    
    /*Exercise 2
    void m(int a);
    */
    
    /*Exercise 3*/
    int m(int a);
}
public class Lamdaexercise {
    /* Exercise 1
    public static void main(String[] args) {
        A ob1=(a,b)->{System.out.println(a+b);};
  }*/
    
    /*Exercise 2
        A ob1=(a)->{System.out.println(a*a);};
    */
    
    /*Exercise 3*/
    public static void main(String[] args) {
        A ob1=(a)->{return a*a;};
        System.out.println(ob1.m(10));
        
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.forEach((n)->System.out.println(n));
    }
    
}
