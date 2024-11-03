class AreaCalculator {
    public double calculateArea(double radius) { // Circle
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) { // Rectangle
        return length * width;
    }
}

public class AreaCalculatorExample {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of Circle: " + calculator.calculateArea(5));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(5, 10));
    }
}

/*
Output:
Area of Circle: 78.53981633974483
Area of Rectangle: 50.0
*/
