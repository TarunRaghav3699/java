// import java.util.Scanner;

// class Shape {
//     private double length;
//     private double breadth;
//     private double base;
//     private double height;

//     // Constructor for a rectangle
//     public Shape(double l, double b) {
//         this.length = l;
//         this.breadth = b;
//     }

//     // Constructor for a triangle
//     public Shape(double b, double h) {
//         this.base = b;
//         this.height = h;
//     }

//     // Calculate area of a rectangle
//     public double area() {
//         return length * breadth;
//     }

//     // Calculate area of a triangle
//     public double area(String shape) {
//         if (shape.equalsIgnoreCase("triangle")) {
//             return 0.5 * base * height;
//         }
//         return -1; // Indicate an unsupported shape
//     }
// }

// public class Practice3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double l, b, base, height;

//         System.out.println("Enter dimensions for the rectangle (length breadth):");
//         l = scanner.nextDouble();
//         b = scanner.nextDouble();

//         System.out.println("Enter dimensions for the triangle (base height):");
//         base = scanner.nextDouble();
//         height = scanner.nextDouble();

//         Shape rectangle = new Shape(l, b);
//         Shape triangle = new Shape(base, height);

//         System.out.println("Area of rectangle: " + rectangle.area());

//         System.out.println("Do you want to calculate the area of a triangle (yes/no)?");
//         String choice = scanner.next();

//         if (choice.equalsIgnoreCase("yes")) {
//             System.out.println("Area of triangle: " + triangle.area("triangle"));
//         } else {
//             System.out.println("No area of triangle calculated.");
//         }

//         scanner.close(); // Close the scanner when done
//     }
// }
