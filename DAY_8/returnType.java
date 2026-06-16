package DAY_8;

import DAY_4.evenOdd;

public class returnType {

    boolean isEven(int num) {
        return num % 2 == 0;       // returns true if num is even, false otherwise
    }

    boolean eligibleToVote(int age) {
        return age >= 18;                               // returns true if age is 18 or above, false otherwise
    }

    String evenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";                  // returns "Even" if num is even, "Odd" otherwise
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;                // returns the area of a circle with the given radius
    }

    public static void main(String[] args) {
        returnType obj = new returnType();

        int number = 30;
        System.out.println(number + " is Even : " + obj.isEven(number));
        System.out.println("Age 20 eligible to vote: " + obj.eligibleToVote(20));
        System.out.println(number + " is: " + obj.evenOdd(number));
        System.out.println("Area of circle with radius 5: " + obj.calculateArea(5));
    }
}
