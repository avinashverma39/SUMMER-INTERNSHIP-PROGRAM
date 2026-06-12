package DAY_5;

//print reverse of  multiple of 3 a number 1 to 100 using while loop
public class revers {
    public static void main(String[] args) {
        int i = 100;
        while (i >= 51) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
