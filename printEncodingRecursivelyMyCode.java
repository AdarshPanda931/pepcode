import java.util.Scanner;

public class printEncodingRecursivelyMyCode {
    static String[] encodings = {
            "", "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();  // Taking input as a string
        sc.close();  // Close the scanner to prevent resource leak
        printEnc(num, "");
    }

    public static void printEnc(String ques, String ans) {
        if (ques.isEmpty()) {     // Base case: when the input string is empty
            System.out.println(ans);
            return;
        }

        if (ques.charAt(0) == '0') {  // Skip invalid cases starting with '0'
            return;
        }

        // Single digit encoding
        int firstDigit = ques.charAt(0) - '0';
        printEnc(ques.substring(1), ans + encodings[firstDigit]);

        // Two-digit encoding (if valid)
        if (ques.length() >= 2) {
            int firstTwoDigits = Integer.parseInt(ques.substring(0, 2));
            if (firstTwoDigits <= 26) {
                printEnc(ques.substring(2), ans + encodings[firstTwoDigits]);
            }
        }
    }
}
