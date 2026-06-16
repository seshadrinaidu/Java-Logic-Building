/*
Problem 9: Take a character and check whether it is a vowel or consonant.

Input:
a

Output:
Vowel

Input:
B

Output:
Consonant

Topics Involved:
- Conditional statements (if, else)
- Logical OR operator (||)
- Character data type

Logic:
- Check whether the character is one of
  a, e, i, o, u (or uppercase versions).
- If yes, print "Vowel".
- Otherwise, print "Consonant".
*/
import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character = ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u' ||
                ch == 'A' || ch == 'E' ||
                ch == 'I' || ch == 'O' ||
                ch == 'U') {

            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}