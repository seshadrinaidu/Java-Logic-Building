/*
/*
Problem 3: Check if a number is divisible by 5.

Input: 10
Output: 10 is Divisible By 5

Input: 22
Output: 22 is not Divisible By 5

Topics Involved:
- Conditional statements (if, else)
- Modulus operator (%)

Logic:
- Take input number.
- Check whether number % 5 == 0.
- If true, print "Divisible By 5".
- Otherwise, print "Not Divisible By 5".
*/

import java.util.*;
public class DivisibleBy5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number= ");
        int number= scanner.nextInt();
        if (number%5==0){
            System.out.println(number+" is Divisible By 5");
        }else{
            System.out.println(number+" is not Divisible By 5");
        }
    }
}
