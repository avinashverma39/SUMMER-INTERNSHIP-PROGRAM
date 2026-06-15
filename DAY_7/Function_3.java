package DAY_7;

public class Function_3 {
    //using function swap 2 numbers
    void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Function_3 obj = new Function_3();
        int x = 10, y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        obj.swap(x, y);
    }
    
}
