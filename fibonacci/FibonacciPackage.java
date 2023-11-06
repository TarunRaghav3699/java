package fibonacci;
import java.util.Scanner;
public class FibonacciPackage{
    public int data;

    public FibonacciPackage(int number){
        data = number;
    }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        FibonacciPackage myObj = new FibonacciPackage(num);
        int fib = 1;
        for (int i= 1; i<=myObj.data; i++){
            fib*=i;
        }
        System.out.println(fib);
        myScanner.close();
    }
}