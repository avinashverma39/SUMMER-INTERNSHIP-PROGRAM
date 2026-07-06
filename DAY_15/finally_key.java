package DAY_15;

public class finally_key {
    public static void main(String args[]) {

        System.out.println("Program Start");
        int c = 10;
        int b = 0;
        int r;

        try {

            r = c / b;
            System.out.println(r);

            int a[] = { 10, 11, 12 };
            System.out.println(a[4]);
        }

        finally{

            System.out.println("This is finally Block......");
        }

}
}