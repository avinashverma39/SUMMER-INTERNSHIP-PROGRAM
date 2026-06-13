package DAY_6;

// greater of three numbers using ternary operator
public class grater3num {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
      // using relational operator
      
        if (a > b && a > c) {
            System.out.println("The greater number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greater number is: " + b);
        } else {
            System.out.println("The greater number is: " + c);
        }

        // using nested if else

        if (a > b) {
            if (a > c) {
                System.out.println("The greater number is: " + a);
            } else {
                System.out.println("The greater number is: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The greater number is: " + b);
            } else {
                System.out.println("The greater number is: " + c);
            }
        }

        // using ternary operator

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The greater number is: " + max);    
    }
}