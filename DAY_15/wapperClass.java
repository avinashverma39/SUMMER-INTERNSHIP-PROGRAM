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

    }
}
