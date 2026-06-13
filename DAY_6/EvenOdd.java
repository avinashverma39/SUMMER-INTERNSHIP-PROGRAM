package DAY_6;

// even odd number using ternery operator
public class EvenOdd {

    public static void main(String[] args) {
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }

}
