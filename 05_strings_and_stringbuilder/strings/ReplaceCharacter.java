import java.util.Scanner;

// Program to replace all occurrences of 'e' with 'i' in a string
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input setup

        System.out.print("Enter a string: ");
        String str = sc.next(); // Read input string (single word)

        sc.close(); // Close scanner
        int len = str.length();

        // METHOD 1: Manual replacement using loop
        String newStr = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'e') {
                newStr += 'i'; // Replace 'e' with 'i'
            } else {
                newStr += str.charAt(i); // Keep original character
            }
        }

        System.out.println("New string with replaced character: " + newStr);

        // METHOD 2: Built-in method to replace characters
        str = str.replaceAll("e", "i");
        System.out.println("New string with replaced character: " + str);
    }
}
