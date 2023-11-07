import Factorial.FactorialPackage;

public class FactorialPackage1 {
    public static void main(String[] args){
        int number = 5;
        int num = FactorialPackage.factorial(number);
        System.out.println("factorial of " + number + " is " +num);
    }
}
