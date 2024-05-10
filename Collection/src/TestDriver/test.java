package TestDriver;

@FunctionalInterface

interface A {

    void m();
}

class Abstraction1 implements A {

    public void m() {
        System.out.println("Hello");
    }
}

public class test {

    public static void main(String[] args) {
        Abstraction1 a = new Abstraction1();
        a.m();

        A ob2 = new A() {
            public void m() {
                System.out.println("hello");
            }
        };

        ob2.m();
    }

}
