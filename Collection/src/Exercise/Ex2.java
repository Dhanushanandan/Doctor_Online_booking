package Exercise;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        
        Integer x[]={1,5,7,3,9,0};
        Double y[]={1.0,1.5,2.0,5.6,3.4};
        sortArray(x);
        sortArray(y);
        
    }
    
    public static<T> void sortArray(T a[]){
        Arrays.sort(a);
        for(T value:a){
            System.out.println(value);
        }
    }
    
}
