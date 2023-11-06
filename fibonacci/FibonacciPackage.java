package fibonacci;
import java.util.Scanner;
public class FibonacciPackage{
    // public int data;

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        fibonaci(num);
        
        // System.out.println(fib);
        myScanner.close();
    }
       public static int fibonaci(int num){
        // FibonacciPackage myObj = new FibonacciPackage();
        int fib = 1;
        for (int i= 1; i<=num; i++){
            fib*=i;
        }
        return fib;
    }
}