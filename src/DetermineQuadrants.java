/*
/*
Problem 26: Take coordinates (x, y) and determine which quadrant
the point lies in.

Input 1:
x = 3
y = 5

Output:
Quadrant 1

Input 2:
x = -4
y = 2

Output:
Quadrant 2

Input 3:
x = -3
y = -6

Output:
Quadrant 3

Input 4:
x = 4
y = -2

Output:
Quadrant 4

Input 5:
x = 0
y = 0

Output:
Origin

Input 6:
x = 0
y = 5

Output:
Lies on Y-axis

Input 7:
x = 7
y = 0

Output:
Lies on X-axis

Topics Involved:
- Conditional statements (if, else if, else)
- Relational operators
- Logical operators (&&)

Logic:
1. If x > 0 and y > 0 → Quadrant I.
2. If x < 0 and y > 0 → Quadrant II.
3. If x < 0 and y < 0 → Quadrant III.
4. If x > 0 and y < 0 → Quadrant IV.
5. If x = 0 and y = 0 → Origin.
6. If x = 0 → Y-axis.
7. If y = 0 → X-axis.
*/


import java.util.Scanner;

public class DetermineQuadrants {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x=scanner.nextInt();

        System.out.print("Enter Y : ");
        int y=scanner.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Quadrant 1 ");
        }else if (x < 0 && y > 0 ){
            System.out.println("Quadrant 2");
        }else if (x < 0 && y < 0){
            System.out.println("Quadrant 3");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrant 4");
        }else if(x==0 && y==0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Lies on Y-axis");
        } else if (y == 0) {
            System.out.println("Lies on X-axis");
        } else {
            System.out.println("Invalid");
        }
    }
}
