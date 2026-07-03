package JavaPackage;

public class pareMeter {

    double area(double length, double breadth) {
        return (length * breadth);
    }

    double perimeter(double length, double breadth) {
        return (2 * (length + breadth));
    }

    double perimeter(double side) {
        return (4 * side);
    }

    double area(double radius) {
        return (3.14 * radius * radius);
    }

    double perimeter2(double radius) {
        return (2 * 3.14 * radius);
    }
}
