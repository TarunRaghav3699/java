interface Sports {
    int sportsWeight = 10;
    void display();
}

class Student {
    String name, rollNumber, course, section;

    void display() {
        System.out.println("Student Info: \nName: " + name + "\nRoll Number: " + rollNumber +
                "\nCourse: " + course + "\nSection: " + section);
    }
}

class Test extends Student {
    String subject1, subject2;
    int marks;

    void display() {
        super.display();
        System.out.println("Test Info: \nSubject 1: " + subject1 + "\nSubject 2: " + subject2 +
                "\nMarks: " + marks);
    }
}

class Result extends Test implements Sports {
    void compare() {
        int average = (Integer.parseInt(subject1) + Integer.parseInt(subject2) + sportsWeight) / 3;
        System.out.println("Average: " + average);
    }

    public void display() {
        super.display();
        System.out.println("Sports Info: \nSports Weight: " + sportsWeight);
    }
}

public class StudentResult implements Sports {
    public static void main(String[] args) {
        Result result = new Result();
        result.name = "Tarun";
        result.rollNumber = "106";
        result.course = "B.Tech";
        result.section = "B";
        result.subject1 = "75";
        result.subject2 = "80";
        result.marks = 85;

        result.display();
        result.compare();
    }

    public void display() {
        System.out.println("Student Result Info: \nSports Weight: " + sportsWeight);
    }
}

// output will be:- 

// Student Info: 
// Name: Tarun
// Roll Number: 106
// Course: B.Tech
// Section: B
// Test Info: 
// Subject 1: 75
// Subject 2: 80
// Marks: 85
// Sports Info: 
// Sports Weight: 10
// Average: 55