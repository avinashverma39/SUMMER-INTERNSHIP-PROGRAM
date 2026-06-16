package DAY_8;

//factorial using function-------
public class factorial {

    void fact(int n) {
        for (int i = n - 1; i > 0; i--){
            n = n * i;
        }
        System.out.println("Factorial is: " + n);
    }

    public static void main(String[] args) {
        int num = 5;
        factorial obj = new factorial();
        obj.fact(num);
    }
}
