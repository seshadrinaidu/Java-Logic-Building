/*
Problem 29 : Take two angles of a triangle and compute the third angle.

Sample Input 1:
Enter First Angle : 60
Enter Second Angle : 60

Sample Output 1:
The third angle is: 60 degrees

Sample Input 2:
Enter First Angle : 45
Enter Second Angle : 90

Sample Output 2:
The third angle is: 45 degrees

Sample Input 3:
Enter First Angle : 100
Enter Second Angle : 90

Sample Output 3:
Invalid angles! The sum of two angles must be less than 180.

Topics Involved:
- Arithmetic operators (+, -)
- Conditional statements (if, else)
- Relational operators (>, <)
- Mathematical property of triangles

Logic:
Step 1:
Take the first angle and second angle as input.

Step 2:
Calculate the third angle using:

thirdAngle = 180 - (angle1 + angle2)

Step 3:
Check whether all three angles are positive.

Condition:
angle1 > 0 && angle2 > 0 && angle3 > 0

Step 4:
- If the condition is true,
  print the third angle.

- Otherwise,
  print "Invalid angles! The sum of two angles must be less than 180."

Triangle Property:

angle1 + angle2 + angle3 = 180°

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class FindThirdAngle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Angle : ");
        int angle1=scanner.nextInt();

        System.out.print("Enter Second Angle : ");
        int angle2=scanner.nextInt();

        int angle3=180-(angle1+angle2);
        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The third angle is: " + angle3 + " degrees");
        } else {
            System.out.println("Invalid angles! The sum of two angles must be less than 180.");
        }

    }
}
