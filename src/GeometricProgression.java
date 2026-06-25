/*
Problem 46 : Take three numbers and check if they are in
Geometric Progression (GP).

Sample Input 1:
Enter First : 2
Enter Second : 4
Enter Third : 8

Sample Output 1:
Geometric Progression

Explanation:
4 / 2 = 2
8 / 4 = 2

Common ratio = 2

--------------------------------------------------

Sample Input 2:
Enter First : 3
Enter Second : 6
Enter Third : 12

Sample Output 2:
Geometric Progression

Explanation:
6 / 3 = 2
12 / 6 = 2

--------------------------------------------------

Sample Input 3:
Enter First : 2
Enter Second : 6
Enter Third : 12

Sample Output 3:
Not GP

Explanation:
6 / 2 = 3
12 / 6 = 2

Ratios are different.

--------------------------------------------------

Sample Input 4:
Enter First : 1
Enter Second : 3
Enter Third : 9

Sample Output 4:
Geometric Progression

Explanation:
3 / 1 = 3
9 / 3 = 3

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else)
- Arithmetic operators (*)
- Mathematical sequences
- Geometric Progression (GP)
- User input using Scanner

Logic:

Step 1:
Take three numbers as input.

Step 2:
Use the GP property:

    b² = a × c

Step 3:
Check:

    b * b == a * c

Step 4:
If true:

    Print "Geometric Progression"

Otherwise:

    Print "Not GP"

Example:

Input:
2 4 8

Check:
4 × 4 = 16
2 × 8 = 16

16 = 16

Output:
Geometric Progression

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second : ");
        int b=scanner.nextInt();
        System.out.print("Enter Third : ");
        int c=scanner.nextInt();
        if (b*b==a*c){
            System.out.println("Geometric Progression");
        }else{
            System.out.println("Not GP");
        }
    }
}
