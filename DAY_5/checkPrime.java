package DAY_5;

// check prime number
public class checkPrime {

    public static void main(String args[]) {

        int n = 7;
        int isPrime = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime++;
                break;
            }
        }
            if (isPrime == 0) {
                System.out.println(n + " is a prime number");
            }
            else {
                System.out.println(n + " is not a prime number");
            }
        
    }
}
