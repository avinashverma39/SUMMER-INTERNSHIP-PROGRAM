package DAY_9;

// Program using array  --------->
public class ArrayNew {

    public static void main(String args[]) {

        int arr[] = { 12, 11, 13, 15, 16, 18, 20 };
        for (int i : arr) {
            if (i % 2 != 0) {

                System.out.println(i);

            }
        }
    }

}
