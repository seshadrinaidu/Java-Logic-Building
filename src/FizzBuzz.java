/*
Problem 32 : Take a number and print "Fizz" if divisible by 3,
"Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.

Sample Input 1:
15

Sample Output 1:
FizzBuzz

Sample Input 2:
9

Sample Output 2:
Fizz

Sample Input 3:
10

Sample Output 3:
Buzz

Sample Input 4:
7

Sample Output 4:
7

Topics Involved:
- Conditional statements (if, else if, else)
- Modulus operator (%)
- Logical AND operator (&&)
- Arithmetic operators
- Multiple condition checking

Logic:

Step 1:
Take a number as input.

Step 2:
Check whether the number is divisible by both 3 and 5.

Condition:
n % 3 == 0 && n % 5 == 0

- If true, print "FizzBuzz".

Step 3:
Otherwise, check whether the number is divisible by 3.

Condition:
n % 3 == 0

- If true, print "Fizz".

Step 4:
Otherwise, check whether the number is divisible by 5.

Condition:
n % 5 == 0

- If true, print "Buzz".

Step 5:
Otherwise,

- Print the number itself.

Flow:

Take Number
      ↓
Divisible by 3 and 5?
      ↓
    Yes → FizzBuzz
      ↓ No
Divisible by 3?
      ↓
    Yes → Fizz
      ↓ No
Divisible by 5?
      ↓
    Yes → Buzz
      ↓ No
Print Number

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n =scanner.nextInt();
        if (n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }else if (n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(n);
        }
    }
}
