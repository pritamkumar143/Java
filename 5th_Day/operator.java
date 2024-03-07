import java.util.*;

public class operator {
    public static void main(String[] args) {
        //Arithmetic Operators 
        System.out.println("Arithmetic Operators\n");
        int A = 123;
        int B = 34;

        System.out.println("Add =" + (A+B));
        System.out.println("Subtract =" + (A-B));
        System.out.println("Multiply =" + (A*B));
        System.out.println("Divide =" + (A/B));
        System.out.println("Modulo(remainder) =" + (A%B));
System.out.println("");        
System.out.println("Unary operator = ++a ,a++ & --a ,a-- \n");


//Pre Increment
System.out.println("Pre Increment\n");

        int a = 14;
        int b =++a;
        
        System.out.println(a);
        System.out.println(b);


System.out.println("Post Increment\n");

//post increment

    int p = 14;
        int d =a++;
        
        System.out.println(p);
        System.out.println(d);

System.out.println("Pre Decrement\n");
        
        
        int r = 14;
        int s = --r;
        
        System.out.println(r);
        System.out.println(s);


        System.out.println("Post Decrement\n");
        
        
        int u = 14;
        int v =u--;
        
        System.out.println(u);
        System.out.println(v);
    }
}