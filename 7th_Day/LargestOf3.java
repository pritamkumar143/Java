import java.util.*;

public class elseIf {
    public static void main(String[] args) {
     int C = 4, B = 5, A = 6; 

     if((A>= B) && (A>= C) ){
        System.out.println("largest is A");
    }
    else if(B >= C) {
        System.out.println("largest is B");
}
else {
    System.out.println("Lasgest is C");
}
    }
}