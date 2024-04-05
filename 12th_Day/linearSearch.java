import java.util.*;

public class ArrayCC {

    public static int LinearSearch(int numbers[],int key){

       for(int i=0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
       } 
       return -1;

    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8};
        int key= 8;

        int index = LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("not found");
        }
        else {

        
        System.out.println("key is at index " + index);
        }

    }
}