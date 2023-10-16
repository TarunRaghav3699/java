/*Question:- Write a program to create a superclass called figure that stores the dimention of a 2D object it also define some method called area that computes area of an object the program derive 2 subclass from the figure 
1) Rectangle
2) Triangle
Each of these subclass override the area method */

class Figure {
    double dimension1;
    double dimension2;

    Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    double area() {
        return 0; // Default implementation (to be overridden by subclasses)
    }
}

class Rectangle extends Figure {
    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double area() {
        return dimension1 * dimension2; // Area of a rectangle
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dimension1 * dimension2; // Area of a triangle
    }
}

public class Shape{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        Triangle triangle = new Triangle(3.0, 6.0);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}


/* "@Override" annotation ka use Java mein tab kiya jata hai jab aap ek subclass banate hain aur aap us subclass mein superclass ki method ko override (badal) kar rahe hain. Yeh annotation programmer aur compiler ko batata hai ki aap ek superclass ki method ko badal rahe hain. Isse compile-time par errors ko pakadne mein madad milti hai, jaise agar method ka naam galat ho ya kuch aur problem ho. Isse code ko padhne wale ke liye bhi aasan hota hai, unhe jaldi pata chalta hai ki kaunsa method superclass ka badla gaya hai. Ise use karna ek acchi practice hai, lekin yeh mandatory nahi hai, aap bina iske bhi code likh sakte hain, lekin iska use aapke code ko secure banata hai aur uski readability ko badhata hai. */
// Source:- Chatgpt 😅