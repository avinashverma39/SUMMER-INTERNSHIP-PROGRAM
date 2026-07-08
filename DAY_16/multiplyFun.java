package DAY_16;

import java.util.*;

public class multiplyFun {

    public static int multiPLy(int a, int b) {

        return a * b;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int multiPly = multiPLy(m, n);
        System.out.println("Multipal of two number is: " + multiPly);
    }
}
