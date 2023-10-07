public class PalindromRecursive {
    public static void main(String[] args) {
        String str = "racecar"; 
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            // Recursively check the substring without the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }
}

