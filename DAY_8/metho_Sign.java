package DAY_8;

public class metho_Sign {
    double show(double a) {
        return a;
    }
    double show(int a) {
        return a;
    }
   public static void main(String[] args) {
      
        metho_Sign obj = new metho_Sign();
        System.out.println("The value of a is: " + obj.show(10));
        System.out.println("The value of a is: " + obj.show(10.5));
    }
   }



