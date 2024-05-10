package Exercise;

import java.util.*;

public class EX5 {

   /* public static void main(String[] args) {
        System.out.println(maxvalue(1,10,6));
        
    }
    
    //only compare an integer value 
    public static int maxvalue(Integer x, Integer y, Integer z) {
        int max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max ;
    }*/
    
    //using generic compare any data type(bounded parameter)
    public static void main(String[] args) {
        System.out.println(maxvalue(1,10,6));
        System.out.println(maxvalue(19.1,10.9,6.5));
        System.out.println(maxvalue("A","A","B"));
    }

    public static<T extends Comparable<T>> T maxvalue(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max ;
    }
}
