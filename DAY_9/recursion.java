package DAY_9;

//Start to recursion  factorial using recursion----
public class recursion {

    int factorial(int num) {

        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String args[]) {

        recursion obj = new recursion();
        System.out.println("Factorial is " + obj.factorial(6));

    }
}