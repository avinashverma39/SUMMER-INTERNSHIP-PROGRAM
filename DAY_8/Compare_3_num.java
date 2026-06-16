package DAY_8;

//larger between 3 number using function`
public class Compare_3_num {
    int compare(int a, int b, int c) {

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is:" + largest);
        return largest;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 15;

        Compare_3_num obj = new Compare_3_num(); // Instance of class
        int result = obj.compare(n1, n2, n3); // function call
        System.out.println("The result is: " + result);
    }
}
