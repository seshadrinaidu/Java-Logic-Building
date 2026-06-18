/*
/*
Problem 17: Take two numbers and determine
            -> whether both are Even
            -> both are Odd
            -> One is Even and One is Odd

Input 1:
a = 1
b = 2

Output:
One is Even and One is Odd

Input 2:
a = 10
b = 20

Output:
Both are Even

Input 3:
a = 15
b = 99

Output:
Both are Odd

Topics Involved:
- Conditional statements (if, else if, else)
- Logical operators (&&, ||)
- Modulus operator (%)

Logic:
Step 1:
Take two numbers as input.

Step 2:
Determine whether each number is even or odd.

Step 3:
- If both numbers are even,
  print "Both are Even".

- Else if one number is even and the other is odd,
  print "One is Even and One is Odd".

- Otherwise,
  print "Both are Odd".

 */
import java.util.Scanner;

public class EvenOrOddCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //step 1: Take Two Input Numbers
        System.out.print("Enter first Number = ");
        int a = scanner.nextInt();

        System.out.print("Enter second Number = ");
        int b = scanner.nextInt();

        //step 2 : check both Numbers
        //if both are Even
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("Both are Even");

            //if One is Even and One is Odd
        }else if(a % 2 == 0 || b % 2 == 0){
            System.out.println("One is Even and One is Odd");

            //if both are Odd
        }else{
            System.out.println("Both are Odd");
        }
    }
}
