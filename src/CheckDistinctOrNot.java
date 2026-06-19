/*
Problem 21: Take a 3-digit number and check if all digits are distinct.

Input 1:
123

Output:
Distinct Numbers

Input 2:
121

Output:
Not Distinct

Input 3:
777

Output:
Not Distinct

Topics Involved:
- Arithmetic operators
- Modulus operator (%)
- Integer division (/)
- Conditional statements (if, else)
- Logical operator (&&)
- Digit extraction

Logic:
Step 1:
Take a three-digit number.

Step 2:
Extract hundreds, tens, and units digits.

Step 3:
Compare the digits.
- If all three digits are different,
  print "Distinct Numbers".
- Otherwise,
  print "Not Distinct".
*/
import java.util.Scanner;

public class CheckDistinctOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre three digit number : ");
        int n = scanner.nextInt();

           int a=n/100;
           int b=(n/10)%10;
           int c=n%10;
           if (a!=b && a!=c && b!=c){
               System.out.println("Distinct Numbers");
           }else{
               System.out.println("Not Distinct");
        }

    }
}
