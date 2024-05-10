package TestDriver;
@FunctionalInterface

interface A {

    void m();
}
public class test2 {
    public static void main(String[] args) {
        A ob1=()->{System.out.println("hello");};
    }
}
