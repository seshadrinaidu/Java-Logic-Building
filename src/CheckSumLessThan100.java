/*
Problem 36 : Take two numbers and check if both are positive
             and their sum is less than 100.

Sample Input 1:
Enter First Number : 40
Enter Second Number : 30

Sample Output 1:
Both are positive and sum is less than 100

Sample Input 2:
Enter First Number : 60
Enter Second Number : 50

Sample Output 2:
Condition not satisfied

Sample Input 3:
Enter First Number : -10
Enter Second Number : 20

Sample Output 3:
Condition not satisfied

Sample Input 4:
Enter First Number : 10
Enter Second Number : 90

Sample Output 4:
Condition not satisfied

Topics Involved:
- Conditional statements (if, else)
- Logical AND operator (&&)
- Arithmetic operator (+)
- Relational operators (>, <)
- Compound conditions

Logic:

Step 1:
Take two numbers as input.

Step 2:
Calculate their sum.

    sum = a + b

Step 3:
Check all conditions together:

    a > 0 && b > 0 && sum < 100

Step 4:
If all conditions are true:
    Print "Both are positive and sum is less than 100"

Otherwise:
    Print "Condition not satisfied"

Example:

Input:
a = 40
b = 30

Sum:
40 + 30 = 70

Check:
40 > 0  -> true
30 > 0  -> true
70 < 100 -> true

Output:
Both are positive and sum is less than 100

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class CheckSumLessThan100 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int b=scanner.nextInt();
        int sum=a+b;

        if (a > 0 && b > 0 && sum < 100){
            System.out.println("Both are positive and sum is less than 100");
        }else{
            System.out.println("Condition not satisfied");
        }

    }
}
