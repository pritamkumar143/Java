import java.util.*;

public class Switch {
    public static void main(String[] args) {
     int number = 2;
     char ch = 'a';

     switch(ch) {
        case 1: System.out.println("samosa");
                    break;

        case 'a': System.out.println("pizzah");
                break;

        case 3: System.out.println("beer");
                break;

        default: System.out.println("we wake up");
    }
}
}