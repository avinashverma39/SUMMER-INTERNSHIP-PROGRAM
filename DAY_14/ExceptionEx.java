package DAY_14;

public class ExceptionEx {

    public static void main(String args[]) {

        int a = 10;
        int b = 0;
        int r;
        System.out.println("Program Start");

        try {
            r = a / b;
            System.out.println(r);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Divide by zero is not allowed");
        }

        System.out.println("Program End");
    }

}
