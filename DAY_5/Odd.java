package DAY_5;
// print all odd numbers from 100 to 51
public class Odd{
    public static void main(String[] args) {
        for (int i = 100; i >= 51; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
