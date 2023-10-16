// Making constructor overloading
class Student {
    int length;
    int breadth;
    int height;

    Student(int h) {
        height = h;
        System.out.println("Height is " + h);
    }

    Student(int l, int b) {
        length = l;
        breadth = b;
    }

    public int rectangle() {
        return length * breadth;
    }
}

class ExtendedStudent extends Student {
    ExtendedStudent(int h) {
        super(h); // Call the constructor of the superclass
    }
}

public class Practice3 {
    public static void main(String[] args) {
        ExtendedStudent myObj = new ExtendedStudent(15);

        if (myObj.length != myObj.breadth) {
            System.out.println("This is a rectangle");
            System.out.println(myObj.rectangle());
        } else {
            System.out.println("This is a square");
            System.out.println(myObj.rectangle());
        }
    }
}

