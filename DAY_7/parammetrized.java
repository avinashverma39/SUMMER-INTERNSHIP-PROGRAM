package DAY_7;

public class parammetrized {
        
    // parameterized function
   void myName(String name) {
        System.out.println("My name is: " + name);
    }
    
   void myRoll(int roll) {
        System.out.println("My roll is: " + roll);
    }
    
   void myCourse(String course) {
        System.out.println("My course is: " + course);
    }
    

    public static void main(String[] args) {
        parammetrized obj = new parammetrized();
        obj.myName("Avinash");
        obj.myRoll(12345);
        obj.myCourse("Computer Science");
    }
}
