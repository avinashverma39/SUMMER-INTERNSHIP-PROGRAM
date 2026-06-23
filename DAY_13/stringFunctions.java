package DAY_13;

public class stringFunctions {

    public static void main(String[] args) {

        String name = new String("Avinash");
        System.out.println(name);
        System.out.println(name.concat(" Verma"));
        System.out.println(name);

        System.out.println("--------------------------------------------------------");

        StringBuilder name1 = new StringBuilder("Avinash");
        System.out.println(name1);
        System.out.println(name1.append(" Verma"));
        System.out.println(name1);

        System.out.println("----------------------------------------------------------");

        StringBuffer name2 = new StringBuffer("Avinash");
        System.out.println(name2);
        System.out.println(name2.append(" Verma"));
        System.out.println(name2);

    }
}
