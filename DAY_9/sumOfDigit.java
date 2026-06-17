package DAY_9;

   class sumOfDigit {

    int sum(int num) {
        int sum = 0;
        for (int i = num; i > 0; i = i / 10) {
            sum = sum + (i % 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        sumOfDigit obj = new sumOfDigit();
        int num = 12345;
        System.out.println("Sum of digits: " + obj.sum(num));
    }
    
}
