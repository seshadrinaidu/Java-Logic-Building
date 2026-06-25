/*
Problem 45 : Take three numbers and check if they are in
Arithmetic Progression.

Sample Input 1:
Enter First : 2
Enter Second : 4
Enter Third : 6

Sample Output 1:
Arithmetic Progression

Explanation:
4 - 2 = 2
6 - 4 = 2

Both differences are equal.

--------------------------------------------------

Sample Input 2:
Enter First : 5
Enter Second : 10
Enter Third : 15

Sample Output 2:
Arithmetic Progression

Explanation:
10 - 5 = 5
15 - 10 = 5

--------------------------------------------------

Sample Input 3:
Enter First : 2
Enter Second : 5
Enter Third : 9

Sample Output 3:
Not Arithmetic Progression

Explanation:
5 - 2 = 3
9 - 5 = 4

Differences are not equal.

--------------------------------------------------

Sample Input 4:
Enter First : 10
Enter Second : 10
Enter Third : 10

Sample Output 4:
Arithmetic Progression

Explanation:
10 - 10 = 0
10 - 10 = 0

Common difference = 0

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else)
- Arithmetic operators (-)
- Mathematical sequences
- Number pattern recognition
- User input using Scanner

Logic:

Step 1:
Take three numbers as input.

Step 2:
Find the difference between first and second numbers.

    d1 = b - a

Step 3:
Find the difference between second and third numbers.

    d2 = c - b

Step 4:
Check:

    d1 == d2

If true:
    Print "Arithmetic Progression"

Else:
    Print "Not Arithmetic Progression"

Example:

Input:
2 4 6

d1 = 4 - 2 = 2
d2 = 6 - 4 = 2

d1 == d2

Output:
Arithmetic Progression

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class ArithematicProgression {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second : ");
        int b=scanner.nextInt();
        System.out.print("Enter Third : ");
        int c=scanner.nextInt();
        if (b-a==c-b){
            System.out.println("Arithmetic Progression");
        }else{
            System.out.println("Not Arithmetic Progression");
        }
    }
}
