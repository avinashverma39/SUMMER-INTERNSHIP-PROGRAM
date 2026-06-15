package DAY_7;

public class Funcion_1 {

    void display() {
        System.out.println("Hello");
    }

    void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Funcion_1 obj = new Funcion_1(); // Object creation

        System.out.println("Program Start");
        obj.display(); // Function calling
        System.out.println("Program End");
        obj.show(); // Function calling
    }

}
