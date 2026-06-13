package DAY_6;

//print star pattern 1 to 9 star using nested loop
public class HW {

    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i - 1) * n + j + " ");
            }
            System.out.println();
        }
    }
}
