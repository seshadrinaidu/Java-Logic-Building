/*
Problem 10: Take a character and check whether it's
uppercase, lowercase, a digit, or a special character.

Sample Input and Output:

Input 1:
A

Output:
Uppercase Letter

Input 2:
z

Output:
Lowercase Letter

Input 3:
7

Output:
Digit

Input 4:
@

Output:
Special Character

Topics Involved:
- Conditional statements (if, else if, else)
- Character data type (char)
- Character class methods
- Method calling

Methods Used:
- Character.isUpperCase()
- Character.isLowerCase()
- Character.isDigit()

Logic:
- Take a character as input.
- Check whether the character is uppercase.
    - If yes, print "Uppercase Letter".
- Otherwise, check whether it is lowercase.
    - If yes, print "Lowercase Letter".
- Otherwise, check whether it is a digit.
    - If yes, print "Digit".
- Otherwise, print "Special Character".
*/
import java.util.Scanner;


public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase Letter");
        }
        else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase Letter");
        }
        else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
