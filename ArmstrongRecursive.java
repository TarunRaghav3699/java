public class ArmstrongRecursive {
    public static void main(String[] args) {
        int number = 153; 
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}
