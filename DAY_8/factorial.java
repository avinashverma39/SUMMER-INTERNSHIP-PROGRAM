package DAY_8;

//factorial using function-------
public class factorial {

    void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);
    }

    public static void main(String[] args) {
        int num = 5;
        factorial obj = new factorial();
        obj.fact(num);
    }
}
