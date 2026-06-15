package DAY_7;

public class Function_4 {
    // function with return type
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function_4 obj = new Function_4();
        int result = obj.add(10, 20);
        System.out.println("Sum is: " + result);
    }
}
