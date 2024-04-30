import java.util.Arrays;
public class selection {
    public static void main(String[] args) {
        int arr[] ={-13,-1,0,5,4,22};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i -1;
            int start=0;

            int maxIndex = getMaxIndex(arr,start,last);
            swap(arr,maxIndex,last);

        }
    }
static void  swap(int[] arr,int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

}

    private static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }




    static void bubble(int[] arr) {
        //run the step n-1 times
        boolean swapped;

        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step , max item will come at the last respective index
            for(int j = 1; j < arr.length -i;j++){
                //swap if the item is samller than the previous item
                if(arr[j]< arr[j-1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }

            // if you did not swap for a particular value  of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }

        }
    }
}