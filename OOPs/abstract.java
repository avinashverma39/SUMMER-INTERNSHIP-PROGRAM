package OOPs;

// abstract class abstract

interface A6 {

    abstract void show();

}

class D6 implements A6 {

    public void show() {
        // System.out.println("Hello show");
    }

    public void display() {
        System.out.println("Hello Display");
    }

}

class C6 {

    public static void main(String[] args) {
        A6 d = new D6();
        // d.show();
        // d.display();
    }
}