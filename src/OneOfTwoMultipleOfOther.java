/*
Problem 14: Check if one of two given numbers is a multiple of the other.

Sample Input and Output:

Input 1:
a = 10
b = 5

Output:
One number is a multiple of the other

Input 2:
a = 6
b = 24

Output:
One number is a multiple of the other

Input 3:
a = 7
b = 5

Output:
Not multiples

Input 4:
a = 0
b = 0

Output:
Cannot Determine

Topics Involved:
- Conditional statements (if, else if, else)
- Modulus operator (%)
- Logical OR operator (||)
- Logical AND operator (&&)
- Edge case handling

Logic:
- If both numbers are 0, print "Cannot Determine".
- Else if one number is 0, one number is a multiple of the other.
- Else if a is divisible by b or b is divisible by a,
  print "One number is a multiple of the other".
- Otherwise, print "Not multiples".
*/
import java.util.Scanner;

public class OneOfTwoMultipleOfOther {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = scanner.nextInt();
        System.out.print("Enter second number = ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0 ){
            System.out.println("Cannot Determine");
        }else if (a == 0 || b == 0){
            System.out.println(" One number is a multiple of the other");
        }
        else if (a % b == 0 || b % a == 0){
            System.out.println("One number is a multiple of the other");
        }else{
            System.out.println("Not multiples");
        }

    }
}
