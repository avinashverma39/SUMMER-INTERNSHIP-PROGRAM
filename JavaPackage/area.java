package JavaPackage;

class area {

    final double PI = 3.14;

    double squreArea(double side) {
        return (side * side);
    }

    double rectangleArea(double length, double breadth) {
        return (length * breadth);

    }

    double circleArea(double radius) {
        return (PI * radius * radius);

    }
}
