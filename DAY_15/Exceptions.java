package DAY_15;

public class Exceptions {
    public static void main(String args[]) {

        System.out.println("Program Start");
     

        try {

            int a[] = { 10, 11, 12 };
            System.out.println(a[4]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Exception is handled");
        }

        System.out.println("Program End");
    }

}
