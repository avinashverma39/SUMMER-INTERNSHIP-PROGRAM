package DAY_7;

public class Statice {
    // static function
    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }
  //non static method
    void myNonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // calling static method without creating an object
        myStaticMethod();
        
        // calling non-static method by creating an object
        Statice obj = new Statice();
        obj.myNonStaticMethod();
    }
    
}
