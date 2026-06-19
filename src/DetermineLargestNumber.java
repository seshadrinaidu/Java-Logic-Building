/*
Problem 22: Take a 3-digit number and determine if the middle digit
is the largest, smallest, or neither.

Input 1:
193

Output:
Middle digit is Largest

Input 2:
918

Output:
Middle digit is Smallest

Input 3:
123

Output:
Neither

Topics Involved:
- Arithmetic operators
- Modulus operator (%)
- Integer division (/)
- Conditional statements (if, else if, else)
- Logical operator (&&)
- Digit extraction

Logic:
1. Extract hundreds, tens, and units digits.
2. Compare the middle digit with the other two digits.
3. If middle digit is greater than both digits, print "Largest".
4. If middle digit is smaller than both digits, print "Smallest".
5. Otherwise, print "Neither".
*/
import java.util.Scanner;

public class DetermineLargestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scanner.nextInt();
        int a=n/100;
        int b=(n/10)%10;
        int c=n%10;
       if (b>a && b>c){
           System.out.println("Middle digit is Largest");
       }else if (b<a && b<c){
           System.out.println("Middle digit is smallest");
       }else {
           System.out.println("Neither");
       }
    }
}
