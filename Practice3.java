class Shape {
    private double length;
    private double breadth;
    private double base;
    private double height;

    // Constructor overloading
    public Shape(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public Shape(double b, double h) {
        this.base = b;
        this.height = h;
    }

    // Calculate area of a rectangle
    public double area() {
        return length * breadth;
    }

    // Calculate area of a triangle
    public double area(String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }
        return -1; // Indicate an unsupported shape
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Shape rectangle = new Shape(5.0, 4.0);
        System.out.println("Area of rectangle: " + rectangle.area());

        Shape triangle = new Shape(3.0, 6.0);
        System.out.println("Area of triangle: " + triangle.area("triangle"));
    }
}
