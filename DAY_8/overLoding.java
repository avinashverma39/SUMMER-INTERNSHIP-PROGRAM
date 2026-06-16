package DAY_8;

public class overLoding {
    // method to add two integers
    int add(int a, int b) {
        return (a>b) ? a : b;
    }

    // method to add three integers
    int add(int a, int b, int c) {
        return (a>b) ? (a>c ? a : c) : (b>c ? b : c);
    }

    // method to add two double values
    double add(double a, double b) {
        return (a>b) ? a : b;
    }

    public static void main(String[] args) {
        overLoding obj = new overLoding();

        // calling the method with two integer arguments
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));

        // calling the method with three integer arguments
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));

        // calling the method with two double arguments
        System.out.println("Sum of 10.5 and 20.5: " + obj.add(10.5, 20.5));
    }
    
}
