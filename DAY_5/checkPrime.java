package DAY_5;

// check prime number
public class checkPrime {

    public static void main(String args[]) {

        int n = 29;
        int isPrime = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime++;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
