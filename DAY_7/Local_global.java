package DAY_7;

//program to local and global variable
public class Local_global {

    // int globalVar = 10; // global variable
    // static int staticVar = 30; // static variable\

    void looVar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is a loop variable: " + i); // loop variable
        }

    }

    public static void main(String[] args) {
        Local_global obj = new Local_global();
        obj.looVar();
        
        // int localVar = 20; // local variable
        // System.out.println("Global variable: " + obj.globalVar);
        // System.out.println("Static variable: " + Local_global.staticVar);
        // System.out.println("Local variable: " + localVar);
        // }
    }
}
