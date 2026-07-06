package DAY_15;

// is a pre define class in java that wraps primitive data types into an objects. It is a part of java.lang package. so that it can be used where object can required.
// Many java feature works only object such as collection freamwork, generic, springboot,hyperNet,javaStream etc. so wrapper class is used to convert primitive data type into object and vice versa.

/* 

primitive data type                    |
                                       |          object/wrapper class
     int                               |   integer                             
      short                            |    Short                             
        byte                           |   Byte
           long                        |   Long
                float                  |   Float
                     double            |   Double
                           char        |   Character
                             boolean   |   Boolean
   


                              Wrapper class is used to convert primitive data type into object and vice versa. It is a part of java.lang package. so that it can be used where object can required.


      Boxing and Unboxing------>
                    converting a primitive data type into object is called boxing and converting an object into primitive data type is called unboxing.

*/

public class wapperClass {

    public static void main(String args[]) {

        int a = 10;
        Integer b = Integer.valueOf(a); // wrapping or boxing
        System.out.println(b);

        Integer c = 20;
        int d = c.intValue(); // unboxing
        System.out.println(d);

        // auto boxing and auto unboxing

        // auto boxing - converting a primitive data type into object is called auto
        // boxing.
        Integer e = 30; // auto boxing
        System.out.println(e);

        // auto unboxing - conerting an object into primitive data type is called auto
        // unboxing.
        int f = e; // auto unboxing
        System.out.println(f);

        // methods of wrapper class
        Integer g = 40;
        System.out.println(g.intValue()); // returns the value of this Integer as an int.
        System.out.println(g.doubleValue()); // returns the value of this Integer as a double.
        System.out.println(g.floatValue()); // returns the \
        System.out.println(g.longValue()); // returns the value of this Integer as a long.
        System.out.println(g.shortValue()); // returns the value of this Integer as a short.

        Integer h = 50;
        System.out.println(h.compareTo(60)); // returns a negative integer, zero, or a positive integer as this Integer
                                             // is less than, equal to, or greater than the specified Integer.
        System.out.println(h.equals(50)); // returns true if this Integer is equal to the specified Integer.
        System.out.println(h.hashCode()); // returns a hash code for this Integer.
    }
}
