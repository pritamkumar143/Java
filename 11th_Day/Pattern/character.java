public class patterns{

    public static void main(String[] args) {
        int n=10;

        char ch ='A';

        //outer loop
        for(int line=0; line<=n; line++){
            //inner loop

            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}