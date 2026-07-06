package DAY_15;

public class MultipalEx {


        public static void main(String args[]) {

        System.out.println("Program Start");
        int c = 10;
        int b = 0;
        int r;

        try {

            r = c / b;
            System.out.println(r);

            int a[] = { 10, 11, 12 };
            System.out.println(a[4]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Exception is handled");
        }

        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Divide by zero is not allowed");
        }

        finally {
        System.out.println("Finally block is always executed");
        }

        System.out.println("Program End");
    }

}

    

