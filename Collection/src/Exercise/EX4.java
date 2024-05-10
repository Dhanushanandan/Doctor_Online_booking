package Exercise;

import java.util.*;

public class EX4 {

    public static void main(String[] args) {
        Integer x[] = {1, 5, 7, 3, 9, 0};
        Double y[] = {1.0, 1.5, 2.0, 5.6, 3.4};
        swapArray(x);
        swapArray(y);
    }

    public static <T> void swapArray(T a[]) {
        
        T temp;
        temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        
        for (T value : a) {
            System.out.println(value);
        }
    }
}
