package DAY_13;

//to check pailndronm yes or no =----
public class checkStrPalin {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcdcba");
        System.out.println(s.reverse());

        String n = new String("JAVA");
        System.out.println(n);
        n = n.replace('J', 'A'); // replace method is used to change the string
        System.out.println(n);
    }
}
