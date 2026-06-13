package DAY_6;

// even odd number using ternary operator
public class EvenOdd {

    public static void main(String[] args) {
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
        
        boolean result1 = (num % 2 == 0) ? true : false;
        System.out.println(num + " is " + (result1 ? "Even" : "Odd"));
    }

}
