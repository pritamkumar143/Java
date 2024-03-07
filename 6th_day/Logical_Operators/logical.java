import java.util.*;

public class logical {
    public static void main(String[] args) {
        // True true :-- true
        System.out.println((3>2) && (5>0));
        //True True :-- True
        System.out.println((3>2) || (5>0));
        // false false :-- false
        System.out.println((3<2) || (5<0));

        System.out.println(!(0>5));
        
        // System.out.println((3>2) ! (5>0));
    }
}