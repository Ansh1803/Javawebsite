class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add (int): " + calc.add(5, 10));
        System.out.println("Add (double): " + calc.add(5.5, 10.5));
        System.out.println("Add (3 int): " + calc.add(1, 2, 3));
    }
}

/*
Output:
Add (int): 15
Add (double): 16.0
Add (3 int): 6
*/
