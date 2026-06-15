package DAY_7;

//program to local and global variable
public class Local_global {

    int globalVar = 10; // global variable
    static int staticVar = 30; // static variable
    public static void main(String[] args) {
        Local_global obj = new Local_global();

        int localVar = 20; // local variable
        System.out.println("Global variable: " + obj.globalVar);
        System.out.println("Static variable: " + Local_global.staticVar);
        System.out.println("Local variable: " + localVar);
    }
}
