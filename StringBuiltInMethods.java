public class StringBuiltInMethods {
    public static void main(String[] args) {
        String sampleText = " Java Programming is Fun and Challenging! ";
        System.out.println("Original length (with spaces): " + sampleText.length());
        String trimmedText = sampleText.trim();
        System.out.println("Trimmed length: " + trimmedText.length());
        System.out.println("Character at index 5: " + sampleText.charAt(5));
        System.out.println("Substring 'Programming': " + trimmedText.substring(5, 16));
        System.out.println("Index of 'Fun': " + trimmedText.indexOf("Fun"));
        System.out.println("Contains 'Java': " + trimmedText.contains("Java"));
        System.out.println("Starts with 'Java': " + trimmedText.startsWith("Java"));
        System.out.println("Ends with '!': " + trimmedText.endsWith("!"));
        System.out.println("Uppercase: " + trimmedText.toUpperCase());
        System.out.println("Lowercase: " + trimmedText.toLowerCase());
        System.out.println("Number of vowels: " + countVowels(trimmedText));
        findAllOccurrences(trimmedText, 'n');
    }

    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) count++;
        }
        return count;
    }

    public static void findAllOccurrences(String text, char target) {
        System.out.print("Occurrences of '" + target + "': ");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) System.out.print(i + " ");
        }
        System.out.println();
    }
}
