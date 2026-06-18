package DAY_10;

public class twoArraySum {

    void arr(int a[], int b[]) {

        if (a.length != b.length) {
            return;
        }
        // int count[] = {};
        for (int i = 0; i < a.length; i++) {

            // if (a[i] != b[i]) {

            System.out.println(a[i] + b[i]);
            // }
        }

        // return count[];
    }

    public static void main(String args[]) {

        int arr1[] = { 12, 13, 14, 15, 16, 17 };
        int arr2[] = { 12, 13, 14, 15, 16, 17 };
        twoArraySum obj = new twoArraySum();
        obj.arr(arr1, arr2);
    }
}
