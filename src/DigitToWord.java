/*
Problem 37 : Take a single digit (0–9) and print its word form ("Zero" to "Nine")

Sample Input 1:
Enter Digit : 0

Sample Output 1:
Zero

Sample Input 2:
Enter Digit : 5

Sample Output 2:
Five

Sample Input 3:
Enter Digit : 9

Sample Output 3:
Nine

Sample Input 4:
Enter Digit : 12

Sample Output 4:
Invalid Digit

Topics Involved:
- Switch statement
- Case labels
- Break statement
- Default case
- User input using Scanner

Logic:

Step 1:
Take a digit as input.

Step 2:
Use a switch statement to check the value of the digit.

Step 3:
Match the digit with the corresponding case.

    0 → Zero
    1 → One
    2 → Two
    3 → Three
    4 → Four
    5 → Five
    6 → Six
    7 → Seven
    8 → Eight
    9 → Nine

Step 4:
Print the corresponding word.

Step 5:
If the input is not between 0 and 9,
execute the default case and print:

    "Invalid Digit"

Example:

Input:
digit = 7

Execution:
switch(7)

Matches:
case 7

Output:
Seven

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int digit=scanner.nextInt();

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Digit");
        }
    }
}
