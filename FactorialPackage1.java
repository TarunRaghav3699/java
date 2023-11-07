import Factorial.FactorialPackage;
import java.util.Scanner;

public class FactorialPackage1 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = myObj.nextInt();
        int num = FactorialPackage.factorial(number);
        System.out.println("factorial of " + number + " is " +num);
        myObj.close();
    }
}
