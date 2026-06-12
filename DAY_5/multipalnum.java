package DAY_5;

// print all numbers which are multiple of 6 from 100 to 1
public class multipalnum {

    public static void main(String[] args) {
        int i = 100;
        while (i >= 1) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
