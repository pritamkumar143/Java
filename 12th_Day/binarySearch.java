import java.util.*;

public class binarySearch {

    public static int BinarySearch(int numbers[],int key){
        int start=0;
        int end =numbers.length-1;

        while(start<=end){ //found
            int mid= (start+end)/2;

            if(numbers[mid]==key){  //right
                return mid;
            } 
            if(numbers[mid]< key){ //left
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        // prerequisite - sorted arrays
        int numbers[] = { 2, 4, 6, 8, 9, 88};
        int key = 2;

        System.out.println("index for key is :" + BinarySearch(numbers, key));

    }
}
