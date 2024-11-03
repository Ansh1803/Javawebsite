class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

public class RectangleExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5.0);
        rect.setWidth(3.0);

        System.out.println("Length: " + rect.getLength() + ", Width: " + rect.getWidth());
    }
}

/*
Output:
Length: 5.0, Width: 3.0
*/
