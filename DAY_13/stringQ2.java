package DAY_13;

//print vowel of an string 
public class stringQ2 {

    public static void main(String[] args) {
        String s1 = "IiAneapple";
        String s = s1.toLowerCase();
        int count = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {

                System.out.println(s.charAt(i));

                count++;

            }
        }
        System.out.println("Total vowel in the string is " + count);

    }

}
