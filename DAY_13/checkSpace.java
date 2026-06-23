package DAY_13;

public class checkSpace {
    public static void main(String[] args) {
        String s = "This is our Java Class";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Total space in the string is: " + count);

        System.out.println(s.replace(' ', '_'));

    }
}