/*
Problem 4: Check if a number is divisible by both 3 and 5.

Input: 10
Output: 10 is Divisible by only 5

Input: 15
Output: 15 is Divisible by both 3 and 5

Input: 9
Output: 9 is Divisible by only 3

Input: 7
Output: 7 is not Divisible by 3 and 5

Topics Involved:
- Conditional statements (if, else if, else)
- Modulus operator (%)
- Logical operator (&&)

Logic:
- Take input number.
- Check whether number % 3 == 0 && number % 5 == 0.
- If true, print "Divisible by both 3 and 5".
- Otherwise, check divisibility by 3.
- Otherwise, check divisibility by 5.
- Else, print "Not divisible by 3 and 5".
*/

import java.util.Scanner;

public class DivisibleByBoth3And5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number= ");
        int number= scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0){
            System.out.println(number+" is Divisible by both 3 and 5");
        }else if (number % 3 == 0){
            System.out.println(number+" is Divisible by only 3");
        }else if (number % 5 == 0){
            System.out.println(number+" is Divisible by only 5");
        }else {
            System.out.println(number+" is not Divisible by 3 and 5 ");
        }
    }
}
