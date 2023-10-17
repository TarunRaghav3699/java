// To calculate factorial of any number
import java.util.Scanner;

class FactorialRecursive{
    static int factorial(int num){
        if (num == 1) {
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = myObj.nextInt();
        int value = factorial(num);
        System.out.println("Factorial is "+value);
        myObj.close();
    }
}