package DAY_10;

public class ArrayFunction {
    int arraySum(int a[]) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 13, 14, 15 };

        ArrayFunction obj = new ArrayFunction();
        System.out.println(obj.arraySum(arr));
        System.out.println("sum of array ");
    }
}
