package DAY_8;

//larger between 2 number using function 
class CompareV {

    void compare(int a, int b) {

        // if (a > b) {
        // System.out.println("a is larger than b");
        // } else {
        // System.out.println("b is larger than a");
        // }

        int larger = (a > b) ? a : b; // using ternary operator
        System.out.println("The larger number is: " + larger);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        CompareV obj = new CompareV(); //Instance of class
        obj.compare(n1, n2);// function call
    }

}
