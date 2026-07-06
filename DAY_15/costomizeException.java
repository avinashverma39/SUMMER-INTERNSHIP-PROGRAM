package DAY_15;

public class costomizeException extends Exception {

    // Also known as user define exception

    // it is an exception created by the programer to handle application or bussines
    // specfic exception

    costomizeException(String massage) {

        super(massage);

    }
}

class CustomException {

    void canVote(int age) throws costomizeException {

        if (age < 18) {

            throw new costomizeException("Age less then 18 ");
        }

        System.out.println("You can vote");
    }

    public static void main(String[] args) {

        try {

            CustomException obj = new CustomException();
            obj.canVote(15);
        }

        catch (costomizeException e) {
            System.out.println(e);
        }

    }
}
