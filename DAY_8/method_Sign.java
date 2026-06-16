package DAY_8;

public class method_Sign {
    double show(double a) {
        return a;
    }
    double show(int a) {
        return a;
    }
   public static void main(String[] args) {
      
        method_Sign obj = new method_Sign();
        System.out.println("The value of a is: " + obj.show(10));
        System.out.println("The value of a is: " + obj.show(10.5));
    }
   }



