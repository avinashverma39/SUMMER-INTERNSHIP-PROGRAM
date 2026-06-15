package DAY_7;

public class multipalParameter {
void  myIntero(int roll, String name, String College, Double percentage) {
        System.out.println("My Roll is: " + roll);
        System.out.println("My Name is: " + name);
        System.out.println("My College is: " + College);
        System.out.println("My Percentage is: " + percentage + "%");
    }

    public static void main(String[] args) {
        multipalParameter obj = new multipalParameter();
        obj.myIntero(12345, "Avinash", "RR College", 75.5);
    }
}
