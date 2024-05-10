package TestDriver;
public class substringex {
    public static void main(String[] args) {
        
        //String in java
        String a="NIBM";
        String b="Srilanka";
        String c="nibm";
        
        
        System.out.println(a.concat(b));
        System.out.println(b.substring(3));
        System.out.println(b.substring(2, 5));
        
        
        //split method
        String value="appple,Bannana,Pine apple";
        String arr[]=value.split(",");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        //CharAt method
        System.out.println(a.charAt(0));
        
        //compareTo
        System.out.println(a.compareTo(b));
        
        //equals method
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.indexOf("lanka"));
        
        
        System.out.println(b.length());
        String out=b.replace('i', 'e');
        System.out.println(out);
        
        
        //remove white space
        String input="  hello world ";
        System.out.println(input.length());
        String value1=input.trim();
        System.out.println(value1.length());
        
        StringBuffer ob1=new StringBuffer("Hello World");
        ob1.append("NIBM KANDY");
        System.out.println(ob1);
    }
}
