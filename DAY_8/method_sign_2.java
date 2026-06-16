package DAY_8;

public class method_sign_2 {
    double show(double b, int a) {
        return a + b;
    }

    double show(int b, double a) {
        return a + b;
    }

    public static void main(String[] args) {
        method_sign_2 obj = new method_sign_2();
        System.out.println("The value of a is: " + obj.show(10, 10.5));
        System.out.println("The value of a is: " + obj.show(10.5, 10));
    }
}
