package DAY_16;

import java.util.*;

public class factorialFun {

    public static void printFact(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {

            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        printFact(n);

    }
}
