import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int marks = 0;
        for (int i = 0; i <4; i++){
            System.out.print("Enter your marks: ");
            int mark = myObj.nextInt();
            marks += mark;
        }
        

    System.out.print(marks);
    myObj.close();
    }
}