// An example of method overriding 
// In below code we use display method for overriding 

/* In the below code the question is:- There is a class named student which includes the variables of name, roll number, course, section, and then a method of  display which will display all these variables and then there is another class named test which will inherit this student class and in this test class we have subjects variable named maths, physics, chemistry, english and computer science and in this we have a method named display again which will display the marks of all these subjects and then we have one another class named result which will inherit this test class and in this class we have a method named compute which will compute the percentage according to the marks and then in this we have a method named display in which we will display all the details.  By:- Tarun Raghav  */

class Student {
    String name;
    int rollNumber;
    String course;
    char section;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
    }
}

class Test extends Student {
    int maths;
    int physics;
    int chemistry;
    int english;
    int computerScience;

    void display() {
        super.display(); // Call the display method of the parent class
        System.out.println("Maths: " + maths);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("English: " + english);
        System.out.println("Computer Science: " + computerScience);
    }
}

class Result extends Test {
    void compute() {
        // Calculate the percentage based on the marks
        int totalMarks = maths + physics + chemistry + english + computerScience;
        double percentage = (totalMarks / 5.0);
        System.out.println("Percentage: " + percentage + "%");
    }

    void display() {
        super.display(); // Call the display method of the parent class
        compute(); // Call the compute method to display the percentage
    }
}

public class Main {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.name = "Tarun Raghav";
        studentResult.rollNumber = 106;
        studentResult.course = "B.Tech CSE";
        studentResult.section = 'B';
        studentResult.maths = 85;
        studentResult.physics = 90;
        studentResult.chemistry = 78;
        studentResult.english = 88;
        studentResult.computerScience = 92;

        studentResult.display();
    }
}
