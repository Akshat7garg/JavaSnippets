import java.util.Scanner;

// Program to generate all possible letter combinations from a given keypad number string
public class KeypadCombinations {

    // Mapping digits to corresponding keypad letters
    public static String keypad[] = new String[] { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // Recursive function to build combinations
    public static void combinations(String keys, int idx, String newPair) {
        if (idx == keys.length()) {
            // Base case: reached end of keys, print formed combination
            System.out.println(newPair);
            return;
        }

        // Get possible letters for current digit
        String keyString = keypad[keys.charAt(idx) - '0'];

        // Recursively build combinations by choosing each letter in keyString
        for (int i = 0; i < keyString.length(); i++) {
            combinations(keys, idx + 1, newPair + keyString.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a key pair: ");
        String keys = sc.next(); // Read input digit string
        sc.close(); // Close scanner

        System.out.println("The keypad alphabet combinations from the given key pair are as follow: ");
        combinations(keys, 0, ""); // Start recursion from index 0 with empty string
    }
}
