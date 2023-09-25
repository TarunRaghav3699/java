public class FibonacciSeries {
    public static void main(String[] args){
        int a,b,c;
        a = 0;
        b = 1;
        c = 0;
        System.out.println("The Fibonacci Series is as Under ");
        do {
            System.out.print(" "+c);
            a = b;
            b = c;
            c = a+b;
        }while (c<100);
    }
    
}
