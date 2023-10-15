// Not for our Exam


// read this code from a book Discrete Mathematics by CL Lie and DP Mohapatra
// Code to find GCD (Greatest Common Divisor) in other words GCD is equal to HCF(Highest common factor)
// if anyone have any doubt the refer to the txt file doubt

import java.util.Scanner;
class Gcd{
    // Definition of the GCD Function
    public int GCD(int n, int m){
        if ((n>=m) && ((n%m)==0)){
            return (m);
        }else {
            return GCD(m,(n%m));
        }
    }
    public static void main(String[] args){
        Gcd newList = new Gcd();
        Scanner myObj = new Scanner(System.in);
        int n, m;
        int result;
        System.out.print("Input the first integer number: ");
        n = myObj.nextInt();
        System.out.print("Input the second integer number: ");
        m = myObj.nextInt();

        result = newList.GCD(n,m);
        System.out.printf("Greatest Common Divisor of : %d and %d is = %d",n,m,result,"\n");
        myObj.close();
    }
}
