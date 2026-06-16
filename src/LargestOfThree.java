/*
Problem 7: Take three numbers and print the largest.

Input 1:
firstNumber = 1
secondNumber = 1
thirdNumber = 1

Output:
Three Numbers are Equal

Input 2:
firstNumber = 20
secondNumber = 50
thirdNumber = 40

Output:
50 is Largest

Topics Involved:
- Conditional statements (if, else if, else)
- Logical AND operator (&&)

Logic:
- Check whether all three numbers are equal.
    - If yes, print "Three Numbers are Equal".
- Otherwise, compare the three numbers.
- Print the largest number.
*/

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number = ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number = ");
        int thirdNumber = scanner.nextInt();

        if (    firstNumber == secondNumber &&
                firstNumber == thirdNumber &&
                secondNumber==thirdNumber     ){
            System.out.println("Three Numbers are Equal");
        }else if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println(firstNumber+"  is Largest");
        }else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println(secondNumber+" is Largest");
        }else {
            System.out.println(thirdNumber+" is Largest");
        }
    }
}
