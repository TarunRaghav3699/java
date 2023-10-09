import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static int counting(int num) {
        // int r, sum = 0;
        int count = 0;

        while (num > 0) {
            // r = num % 10;
            // sum = sum + r;
            if (num % 10 > (0)) {
                count = count + 1;
            }
            num /= 10;
        }
        System.out.println("count "+count+Math.valueOf(num));
        return count;
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        // Calculate the sum of the cubes of each digit
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, counting(originalNum));
            originalNum /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}
