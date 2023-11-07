import Factorial.FactorialPackage;
import java.util.Scanner;

public class FactorialPackage1 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = myObj.nextInt();


        // Using our factorial package 👇
        int num = FactorialPackage.factorial(number);


        System.out.println("factorial of " + number + " is " +num);
        myObj.close();
    }
}
