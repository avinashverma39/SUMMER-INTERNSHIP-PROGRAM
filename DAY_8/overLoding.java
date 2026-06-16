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

        System.out.println("Grater of 40 and 40: " + obj.add(40, 120));
        System.out.println("Greater of 10, 20 and 40: " + obj.add(430, 403, 440));
        System.out.println("Greater of 10.40 and 20.40: " + obj.add(10.40, 20.40));
    }
    
}
