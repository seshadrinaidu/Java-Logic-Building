/*
Problem 48 : Take an integer (1–9999) and check whether the
sum of its digits is greater than the product of its digits.

Sample Input 1:
Enter Number : 123

Sample Output 1:
Sum of digits is greater than the product of digits.

Explanation:
Digits = 1, 2, 3

Sum = 1 + 2 + 3 = 6
Product = 1 × 2 × 3 = 6

Since sum is not greater than product,
they are equal.

--------------------------------------------------

Sample Input 2:
Enter Number : 1112

Sample Output 2:
Sum of digits is greater than the product of digits.

Explanation:
Sum = 1 + 1 + 1 + 2 = 5
Product = 1 × 1 × 1 × 2 = 2

5 > 2

--------------------------------------------------

Sample Input 3:
Enter Number : 234

Sample Output 3:
Product of digits is greater than the sum of digits.

Explanation:
Sum = 2 + 3 + 4 = 9
Product = 2 × 3 × 4 = 24

24 > 9

--------------------------------------------------

Topics Involved:
- While loop
- Digit extraction
- Arithmetic operators (+, *)
- Conditional statements (if, else)
- User input using Scanner

Logic:

Step 1:
Take an integer as input.

Step 2:
Initialize:

sum = 0
product = 1

Step 3:
Repeat until the number becomes 0.

Extract last digit.

digit = number % 10

Add it to sum.

Multiply it with product.

Remove the last digit.

number = number / 10

Step 4:
Compare:

sum > product

If true:
Print "Sum of digits is greater than the product."

Else:
Print "Product of digits is greater than or equal to the sum."

Time Complexity:
O(d)
where d = number of digits (maximum 4)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class SumOfDigitsEqualToProductOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer (1-9999) : ");
        int n=scanner.nextInt();
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        if(sum>product){
            System.out.println("Sum of digits are greater than product of digit");
        }else if(sum<product){
            System.out.println("Product of digits are greater than the sum of digits");
        }else{
            System.out.println("Sum and Product are equal");
        }
    }
}
