package DAY_6;

//person can vote or not using ternary operator
public class vote {

    public static void main(String[] args) {
        int age = 15;
        String result = (age >= 18) ? "You can vote." : "You cannot vote.";
        System.out.println(result);
    }
}
