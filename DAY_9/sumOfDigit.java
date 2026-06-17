package DAY_9;

public class sumOfDigit {

    int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        sumOfDigit obj = new sumOfDigit();
        int num = 12345;
        System.out.println("Sum of digits: " + obj.sum(num));
    }
}
