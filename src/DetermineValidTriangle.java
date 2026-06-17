/*
Problem 12: If the triangle is valid, determine whether it is
Equilateral, Isosceles, or Scalene.

Sample Input and Output:

Input 1:
a = 5
b = 5
c = 5

Output:
Equilateral Triangle

Input 2:
a = 5
b = 5
c = 3

Output:
Isosceles Triangle

Input 3:
a = 4
b = 5
c = 6

Output:
Scalene Triangle

Input 4:
a = 1
b = 2
c = 5

Output:
Invalid Triangle

Topics Involved:
- Conditional statements (if, else if, else)
- Nested if statements
- Logical AND operator (&&)
- Logical OR operator (||)
- Comparison operators (==)
- Triangle Inequality Theorem

Logic:

Step 1:
Take three sides a, b, and c.

Step 2:
Check whether the triangle is valid:
a + b > c
a + c > b
b + c > a

Step 3:
If the triangle is valid:

    - If all three sides are equal,
      print "Equilateral Triangle".

    - Else if any two sides are equal,
      print "Isosceles Triangle".

    - Else,
      print "Scalene Triangle".

Step 4:
If the triangle is invalid,
print "Invalid Triangle".
*/
import java.util.Scanner;

public class DetermineValidTriangle {
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
            if (a==b && b==c){
                System.out.println("Equilateral Triangle");
            }else if (a==b || b==c||a==c){
                System.out.println("Isosceles Triangle");
            }else {
                System.out.println("Scalene Triangle");
            }
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
