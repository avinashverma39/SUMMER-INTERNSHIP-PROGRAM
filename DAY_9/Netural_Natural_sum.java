package DAY_9;

// First Netural number sum using recursion---------------------->
public class Netural_Natural_sum {

    int sum(int num) {

        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);

    }

    public static void main(String[] args) {
        Netural_Natural_sum obj = new Netural_Natural_sum();

        System.out.println(obj.sum(50));
    }

}
