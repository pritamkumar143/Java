public class SortedMatrix {

    public static void main(String[] args) {

    }
    static int[]binarySearch(int[] matrix, int row,int cStart,int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid]==target){
                return new int []{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length; //be cautious, matrix may be empty 
        if(rows==1){
            return binarySearch(matrix,row:0,cStart:0,cEnd:cols-1,target);
        }

        
    }
}