package JavaPackage;

public class mainClass {

    public static void main(String[] args) {
        Arithmatic obj = new Arithmatic();

        System.out.println((obj.sum(10, 5)));
        System.out.println((obj.sub(10, 5)));
        System.out.println((obj.multi(10, 5)));
        System.out.println((obj.divid(10, 5)));
        System.out.println((obj.modulo(10, 5)));

        area obj2 = new area();
        System.out.println(obj2.squreArea(12.4));
        System.out.println(obj2.rectangleArea(12.4, 5.4));
        System.out.println(obj2.circleArea(5));


        pareMeter obj3 = new pareMeter();
        System.out.println(obj3.area(12.4, 5.4));   
        System.out.println(obj3.perimeter(12.4, 5.4));
        System.out.println(obj3.perimeter(5.4));    
        System.out.println(obj3.area(5));   
        System.out.println(obj3.perimeter2(5));
        

    }

}
