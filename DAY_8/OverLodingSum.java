package DAY_8;

public class OverLodingSum {
    void add(int a, int b) {
        System.out.println("Sum of a and b: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of a, b and c: " + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("Sum of a, b, c and d: " + (a + b + c + d));
    }

    public static void main(String[] args) {
        OverLodingSum obj = new OverLodingSum();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
    }
}
