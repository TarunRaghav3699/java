// To find the palindrom of a number
class Something {
    public void palindrom(int num) {
        int num2 = num;
        int reversed = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = Math.floorDiv(num, 10);
        }

        if (num2 == reversed) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Something myObj = new Something();
        myObj.palindrom(12321);
        myObj.palindrom(13321);
    }
}
