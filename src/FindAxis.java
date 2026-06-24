/*
Problem 41 : Take coordinates (x, y) and check if the point
lies on the X-axis, Y-axis, or at the origin.

Sample Input 1:
Enter X-axis : 0
Enter Y-axis : 0

Sample Output 1:
Lies on Origin

--------------------------------------------------

Sample Input 2:
Enter X-axis : 0
Enter Y-axis : 5

Sample Output 2:
Lies on Y-axis

--------------------------------------------------

Sample Input 3:
Enter X-axis : 7
Enter Y-axis : 0

Sample Output 3:
Lies on X-axis

--------------------------------------------------

Sample Input 4:
Enter X-axis : 4
Enter Y-axis : 8

Sample Output 4:
Neither axis

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else if, else)
- Logical AND operator (&&)
- Coordinate Geometry
- User input using Scanner

Logic:

Step 1:
Take x and y coordinates as input.

Step 2:
Check if both x and y are 0.

    x == 0 && y == 0

If true:
    Print "Lies on Origin"

Step 3:
Otherwise, check if x is 0.

    x == 0

If true:
    Print "Lies on Y-axis"

Step 4:
Otherwise, check if y is 0.

    y == 0

If true:
    Print "Lies on X-axis"

Step 5:
If none of the above conditions are true,
the point lies somewhere in a quadrant.

    Print "Neither axis"

Example:

Input:
x = 0
y = 8

Check:
x == 0 && y == 0 → false
x == 0           → true

Output:
Lies on Y-axis

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class FindAxis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X-axis : ");
        int x=scanner.nextInt();
        System.out.print("Enter Y-axis : ");
        int y=scanner.nextInt();

        if (x==0 && y==0){
            System.out.println("Lies on Origin");
        }else if (x==0){
            System.out.println("Lies on Y-axis");
        }else if (y==0){
            System.out.println("Lies on X-axis");
        }else{
            System.out.println("Neither axis");
        }
    }
}
