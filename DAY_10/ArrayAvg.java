package DAY_10;

// programe to find average of an array
public class ArrayAvg {
    public static void main(String args[]) {
        int sum = 0;
        int a[] = { 10, 20, 30, 40 };

        for (int i : a) {
            sum = sum + i;
        }

        System.out.println(sum / 4);
    }
}
