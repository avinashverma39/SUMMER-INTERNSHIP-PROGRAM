package DAY_5;

// print all numbers divisible by 5 from 1 to 100
public class divideby5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
