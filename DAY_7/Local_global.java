package DAY_7;

//program to local and global variable
public class Local_global {

    int globalVar = 10; // global variable

    public static void main(String[] args) {
        Local_global obj = new Local_global();

        int localVar = 20; // local variable
        System.out.println("Global variable: " + obj.globalVar);
        System.out.println("Local variable: " + localVar);
    }
}
