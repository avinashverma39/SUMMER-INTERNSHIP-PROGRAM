package DAY_10;

public class EVenOddArr {

    public static void main(String args[]) {

        int arr[] = { 12, 13, 14, 15, 16 };
        int count = 0, cunt2 = 0;
        for (int i : arr) {

            if (i % 2 == 0) {
                System.out.println("Even");
                count++;
            } else {
                System.out.println("odd");
                cunt2++;
            }
        }

        System.out.println("Even Number is: " +count);
        System.out.println("Odd Number is: " +cunt2);

    }
}
