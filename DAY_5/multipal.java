package DAY_5;

//print multiple of 6 using do while loop
public class multipal {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 6 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

}
