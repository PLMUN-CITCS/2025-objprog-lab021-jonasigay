import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Count words and display result
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
        
        scanner.close();
    }
    
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}