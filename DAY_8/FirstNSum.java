package DAY_8;

public class FirstNSum {

    int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;

        // System.out.println("Sum of first natural numbers is: " + sum);
    }

    public static void main(String[] args) {
        FirstNSum obj = new FirstNSum();
        int num = 20;
        System.out.println("Sum of first natural numbers is: " + obj.sum(num));
    }

}
