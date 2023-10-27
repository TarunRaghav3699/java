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
