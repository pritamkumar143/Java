import java.util.*;

public class TypeCast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a = 69.15f;
        // int b = a;  // not convert to float to int

        int b = (int) a;
        System.out.println(b);

    }
}
