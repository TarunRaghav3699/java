import java.util.Scanner;
class Grade{
    public void grade(){
        int marks = percent;
        if (marks > 75){
            System.out.println("Grade A, Excellent");
        }else if (marks <75 && marks >= 60){
            System.out.println("Grade B, Very Good");
        }else if (marks < 60 && marks >= 45){
            System.out.println("Grade C, Good");
        }else if (marks < 45 && marks >= 33){
            System.out.println("Grade D, Pass");
        }else if( marks <33) {
            System.out.println("Grade F, Fail");
        }
    }
    public static void main(String[] args){
        Grade myGrade = new Grade();
        Scanner myObj = new Scanner(System.in);
        int marks = 0;
        for (int i = 0; i <5; i++){
            System.out.print("Enter your marks: ");
            int mark = myObj.nextInt();
            marks += mark;
        }
        int percent = marks/5;
    System.out.print("Total marks is "+ marks +"\n");
    System.out.print("Total percent is "+ percent +"%\n");
    String a = myGrade.grade(percent);
    System.out.println(a);
    myObj.close();
    }
}