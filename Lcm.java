// Not for our Exam


// In this i am Calculating the LCM(least common multiple)
// if anyone have any doubt the refer to the txt file doubt

import java.util.Scanner;
class Lcm {
    public int gcd(int m, int n){
        int ans;
        if (m<n){
            ans = gcd(n,m);
        }else if(n==0){
            ans = m;
        }else {
            ans = gcd(n,m%n);
        }
        return (ans);
    }
    public static void main(String[] args){
        int m, n, lcm1, hcf1;
        Lcm newLine = new Lcm();
        Scanner myObj = new Scanner(System.in);
        char a = 'y';
        System.out.println("Calculating LCM of two positive numbers from their GCD \n");
        do{
            System.out.println("Enter the two numbers: ");
            m = myObj.nextInt();
            n = myObj.nextInt();
            hcf1 = newLine.gcd(m,n);
            lcm1 = (m*n)/hcf1;
            System.out.printf("\n LCM of %d and %d is: %d\n Do you want to find LCM of two more Numbers?\ny/n\n",m,n,lcm1);
            a = myObj.next().charAt(0);

        }while(a == 'y');
        myObj.close();
    }
}
