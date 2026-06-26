/*
Problem 47 : Take a 3-digit number and check if the sum of the
first and last digit equals the middle digit.

Sample Input 1:
Enter Number : 242

Sample Output 1:
Sum of 2 and 2 is equal to 4

Explanation:
First digit = 2
Middle digit = 4
Last digit = 2

2 + 2 = 4

--------------------------------------------------

Sample Input 2:
Enter Number : 352

Sample Output 2:
Sum of 3 and 2 is equal to 5

Explanation:
3 + 2 = 5

--------------------------------------------------

Sample Input 3:
Enter Number : 123

Sample Output 3:
Not equal

Explanation:
1 + 3 = 4
Middle digit = 2

4 ≠ 2

--------------------------------------------------

Sample Input 4:
Enter Number : 99

Sample Output 4:
Invalid Number

Explanation:
The input is not a 3-digit number.

--------------------------------------------------

Topics Involved:
- User input using Scanner
- Conditional statements (if, else)
- Logical operator (&&)
- Arithmetic operators (+, /, %)
- Digit extraction
- Input validation

Logic:

Step 1:
Take a number as input.

Step 2:
Check whether it is a 3-digit number.

    number >= 100 && number <= 999

If not:
    Print "Invalid Number"

Step 3:
Extract the digits.

    first = number / 100
    middle = (number / 10) % 10
    last = number % 10

Step 4:
Calculate:

    first + last

Step 5:
Compare the sum with the middle digit.

If equal:
    Print "Sum of first and last digit is equal to the middle digit."

Otherwise:
    Print "Not equal"

Example:

Input:
352

Digits:
First = 3
Middle = 5
Last = 2

Check:
3 + 2 = 5

Output:
Sum of 3 and 2 is equal to 5

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class CheckThreeNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter  Number : ");
        int n=scanner.nextInt();
        if (n>99 && n<1000) {
            int first = n / 100;
            int middle = (n / 10) % 10;
            int last = n % 10;

            if (first + last == middle) {
                System.out.println("Sum of " + first + " and " + last + " is equal to " + middle);
            } else {
                System.out.println("Not equal");
            }
        }
        else {
            System.out.println("Invalid Number");
            }
    }
}
