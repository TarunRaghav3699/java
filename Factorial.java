import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = myObj.nextInt(); 
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
        myObj.close();
    }
}
