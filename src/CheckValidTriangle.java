/*
Level 2

Problem 1: Take three sides and check whether they form a valid triangle.

Sample Input and Output:

Input 1:
a = 3
b = 4
c = 5

Output:
Valid Triangle

Input 2:
a = 1
b = 2
c = 5

Output:
Invalid Triangle

Input 3:
a = 7
b = 10
c = 5

Output:
Valid Triangle

Topics Involved:
- Conditional statements (if, else)
- Logical AND operator (&&)
- Relational operators (>)
- Triangle Inequality Theorem

Logic:
Step 1:
Take three sides a, b, and c.

Step 2:
Check the following conditions:
a + b > c
a + c > b
b + c > a

Step 3:
If all three conditions are true,
print "Valid Triangle".

Otherwise,
print "Invalid Triangle".
*/
import java.util.Scanner;

public class CheckValidTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //step 1: Take Three sides
        System.out.print("Enter First side = ");
        int a = scanner.nextInt();

        System.out.print("Enter Second side = ");
        int b = scanner.nextInt();

        System.out.print("Enter Third side = ");
        int c = scanner.nextInt();

        //step 2: Check Three sides
        if ((a + b > c) && ( a + c > b) && ( b + c > a)){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
