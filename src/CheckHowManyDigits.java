/*
Problem 24: Determine whether a number is single-digit,
double-digit, or multi-digit.

Input 1:
7

Output:
7 is single digit

Input 2:
42

Output:
42 is double digit

Input 3:
123

Output:
123 is multi digit

Topics Involved:
- while loop
- Arithmetic operators
- Modulus operator (%)
- Integer division (/)
- Conditional statements (if-else)
- Counting digits

Logic:
1. Take a number.
2. Repeatedly remove the last digit using n = n / 10.
3. Count how many times this operation is performed.
4. If count = 1 → single digit.
5. If count = 2 → double digit.
6. Otherwise → multi digit.
*/

import java.util.Scanner;

public class CheckHowManyDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int original = n;
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        if (count==1){
            System.out.println(original +" is single digit");
        }else if (count==2){
            System.out.println(original +" is double digit");
        }else {
            System.out.println(original +" is multi digit");
        }
    }
}
