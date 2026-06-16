package DAY_8;

public class OverLodingSum {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        OverLodingSum obj = new OverLodingSum();

        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));
        System.out.println("Sum of 10, 20, 30 and 40: " + obj.add(10, 20, 30, 40));
    }
}
