import java.util.Scanner;

class Student {
    String name;
    int roll;
    String course;

    Student(String Name, int Roll, String Course) {
        name = Name;
        roll = Roll;
        course = Course;
    }

    public void display() {
        System.out.println("Name is " + name + " roll number is " + roll + " course is " + course);
    }
}

class Test extends Student {
    Test(String Name, int Roll, String Course) {
        super(Name, Roll, Course);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myObj.next();
        System.out.print("Enter your roll number: ");
        int roll = myObj.nextInt();
        System.out.print("Enter your course: ");
        String course = myObj.next();
        Test a = new Test(name, roll, course);
        a.display();
        myObj.close();
    }
}
