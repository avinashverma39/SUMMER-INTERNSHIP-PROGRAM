package DAY_7;

public class My_intro {
      
    int roll = 12345;
    String name = "Avinash";
    String College = "RR College";
    Double percentage = 75.5;


    void display() {
        // System.out.println("My name is Avinash");
        // System.out.println("I am from Basti");
        // System.out.println("I am a student of Computer Science");
        // System.out.println("Curently I am in  year of my graduation");
        // System.out.println("Curently I am learning Java");
        // System.out.println("I am interested in programming and software development");
        
        System.out.println("My Roll is: " + roll);
        System.out.println("My Name is: " + name);
        System.out.println("My College is: " + College);
        System.out.println("My Percentage is: " + percentage + "%");
    }

    public static void main(String[] args) {
        My_intro obj = new My_intro(); // Object creation
        obj.display(); // Function calling
    }

}
