package DAY_8;

//program to sum of 1 to 50 odd numbers 
public class sum_of_odd_num {

    int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sum_of_odd_num obj = new sum_of_odd_num();
        int num = 50;
        System.out.println("Sum of odd numbers from 1 to 50 is: " + obj.sum(num));
    }

}
