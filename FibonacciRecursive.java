import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        System.out.println("Fibonacci Series:");
        // giving input to the function through loop
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + "\n");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

// ⚠️Don't try to give the input greater than 40. Because it's a recursive function it will take a lot of time to do the task.⚠️