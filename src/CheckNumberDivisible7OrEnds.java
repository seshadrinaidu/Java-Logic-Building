/*
Problem 25 : Check if a number is a multiple of 7 or ends with 7.

Input 1:
14

Output:
14 is a multiple of 7

Input 2:
27

Output:
27 ends with 7

Input 3:
77

Output:
77 is a multiple of 7 and ends with 7

Input 4:
25

Output:
25 is neither a multiple of 7 nor ends with 7

Topics Involved:
- Conditional statements (if, else if, else)
- Modulus operator (%)
- Logical operator (&&)
- Last digit extraction

Logic:
1. Take a number.
2. Extract the last digit using n % 10.
3. Check:
   - If the number is divisible by 7 and ends with 7.
   - Else if divisible by 7.
   - Else if ends with 7.
   - Otherwise, neither condition is true.
*/
import java.util.Scanner;

public class CheckNumberDivisible7OrEnds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre Number : ");
        int n = scanner.nextInt();

      int lastDigit=n%10;

        if (n % 7 == 0 && lastDigit == 7){
            System.out.println(n + " is a multiple of 7 and ends with 7");
        }
        else if (n % 7 == 0){
            System.out.println(n + " is a multiple of 7");
        }
        else if (lastDigit == 7){
            System.out.println(n + " ends with 7");
        }
        else{
            System.out.println(n + " is neither a multiple of 7 nor ends with 7");
        }

    }
}
