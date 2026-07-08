package DAY_16;

import java.util.*;

public class functions {

    public static int sumTwoNUm(int a, int b) {

        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumTwoNUm(a, b);
        System.out.println("Sum of two number is: " + sum);
    }
}
