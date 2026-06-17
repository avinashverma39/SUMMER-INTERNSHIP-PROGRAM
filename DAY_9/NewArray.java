package DAY_9;

public class NewArray {

    public static void main(String args[]) {

        int arr[] = { 10, 11, 12, 13, 14, 15 };
        int b[] = {0,0,0,0,0};
           
        for(int i : arr){

            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            b[i] = arr[4 - i];
        }

        for(int i : b){
         System.out.println(i);


        }


    }
}
