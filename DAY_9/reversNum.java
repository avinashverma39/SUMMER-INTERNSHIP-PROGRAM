package DAY_9;

public class reversNum {

    int reverse(int num) {
        int rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            int n = i % 10;
            rev = rev * 10 + n;
        }
        return rev;
    }

    public static void main(String[] args) {
        reversNum obj = new reversNum();
        int num = 12345;
        System.out.println("Reverse of the number: " + obj.reverse(num));
    }

}
