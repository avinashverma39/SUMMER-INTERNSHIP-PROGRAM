package DAY_10;

public class checkArrayEqual {
    boolean arr(int a[], int b[]) {

        if (a.length != b.length) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {

                count++;
            }
        }

        return (count == 0) ? true : false;
    }

    public static void main(String args[]) {

        int arr1[] = { 12, 13, 14, 15, 16, 17 };
        int arr2[] = { 12, 13, 14, 15, 16, 17 };
        checkArrayEqual obj = new checkArrayEqual();
        System.out.println(obj.arr(arr1, arr2));
    }
}
