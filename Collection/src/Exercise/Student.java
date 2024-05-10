package Exercise;
import java.util.*;
public class Student {
        String name;
        String address;
        
        Student(String name,String address){
            this.name=name;
            this.address=address;
        }
}

class StudentList{
    public static void main(String[] args) {
        Student st=new Student("Amal","Kandy");
        Student st1 =new Student("Kamal","Colombo");
        ArrayList<Student> li=new ArrayList<Student>();
        li.add(st);
        li.add(st1);
        
        Iterator itr=li.iterator();
        while(itr.hasNext()){
            Student st3=(Student)itr.next();
            System.out.println("name:"+st3.name+"Address:"+st3.address);
        }
        
    }
}