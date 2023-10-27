import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum, remainder, result = 0;
        int n = 0;

        originalNum = num;

        // Count the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        sc.close();
    }
}







public class StringMethodsDemo {
    public static void main(String[] args) {
        // Create a sample string
        String text = "Hello, World!";

        // String methods
        int length = text.length();
        String concatResult = text.concat(" How are you?");
        char charAtIndex = text.charAt(7);
        int compareToResult = text.compareTo("Hello, Universe!");
        int indexOfResult = text.indexOf("World");
        boolean equalsResult = text.equals("Hello, World!");
        String[] words = text.split(" ");
        String joined = String.join(" - ", words);
        String trimmed = text.trim();

        // Print results
        System.out.println("Length: " + length);
        System.out.println("Concatenated: " + concatResult);
        System.out.println("Character at index 7: " + charAtIndex);
        System.out.println("Compare To: " + compareToResult);
        System.out.println("Index of 'World': " + indexOfResult);
        System.out.println("Equals 'Hello, World!': " + equalsResult);
        System.out.println("Joined: " + joined);
        System.out.println("Trimmed: '" + trimmed + "'");
    }
}
