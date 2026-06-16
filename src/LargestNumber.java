/*
Problem 6: Take two numbers and print the larger one.

Input 1:
firstNumber = 1
secondNumber = 1

Output:
Both are equal

Input 2:
firstNumber = 20
secondNumber = 50

Output:
50 is Largest

Topics Involved:
- Conditional statements (if, else if, else)

Logic:
- Check whether both numbers are equal.
    - If equal, print "Both are equal".
- Otherwise, compare the numbers.
- Print the larger number.
*/
import java.util.Scanner;

public class LargestNumber {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number= ");
        int firstNumber=scanner.nextInt();
        System.out.print("Enter second number= ");
        int secondNumber=scanner.nextInt();
        if (firstNumber==secondNumber){
            System.out.println(firstNumber+" and "+secondNumber+" Both are equal");
        }else if (firstNumber > secondNumber){
            System.out.println(firstNumber+" is Largest");
        }else{
            System.out.println(secondNumber+" is Largest");
        }
    }
}
