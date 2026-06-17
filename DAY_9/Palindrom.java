package DAY_9;

public class Palindrom {
    int palindrom(int num) {
        int rev = 0;

        for (int i = num; i > 0; i = i / 10) {

            int n = i % 10;

            rev = rev * 10 + n;
        }

        if (num == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
        return rev;
    }

    public static void main(String[] args) {
        Palindrom obj = new Palindrom();
        int num = 12322;
        obj.palindrom(num);
    }
}
