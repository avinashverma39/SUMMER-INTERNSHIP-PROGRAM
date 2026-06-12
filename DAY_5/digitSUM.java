package DAY_5;

// print sum of digits of a number for loop
public class digitSUM {

    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum = sum + i % 10;
        }
        System.out.println(sum);
    }
}
