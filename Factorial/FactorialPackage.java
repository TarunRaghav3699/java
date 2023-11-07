package Factorial;
import java.util.Scanner;
public class FactorialPackage{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        factorial(num);
        myScanner.close();
    }
       public static int factorial(int num){
        int fact = 1;
        for (int i= 1; i<=num; i++){
            fact*=i;
        }
        // System.out.println(fact);
        return fact;
    }
}