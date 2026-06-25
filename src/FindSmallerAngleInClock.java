/*
/*
Problem 44 : Take time (hours and minutes) and print the
smaller angle between the hour and minute hands.

Sample Input 1:
Enter Hours : 3
Enter Minutes : 0

Sample Output 1:
90.0

Explanation:
Hour hand = 90°
Minute hand = 0°
Angle = 90°

--------------------------------------------------

Sample Input 2:
Enter Hours : 6
Enter Minutes : 0

Sample Output 2:
180.0

Explanation:
Hour hand = 180°
Minute hand = 0°
Angle = 180°

--------------------------------------------------

Sample Input 3:
Enter Hours : 9
Enter Minutes : 0

Sample Output 3:
90.0

Explanation:
Difference = 270°
Smaller angle = 360 - 270 = 90°

--------------------------------------------------

Sample Input 4:
Enter Hours : 12
Enter Minutes : 30

Sample Output 4:
165.0

Explanation:
Hour hand = 15°
Minute hand = 180°
Angle = 165°

--------------------------------------------------

Topics Involved:
- Arithmetic operations
- Mathematical formulas
- double data type
- Math.abs()
- Math.min()
- User input using Scanner
- Time and clock calculations

Logic:

Step 1:
Take hours and minutes as input.

Step 2:
Calculate hour hand angle.

    hourAngle = (hours % 12) * 30
                + minutes * 0.5

Step 3:
Calculate minute hand angle.

    minuteAngle = minutes * 6

Step 4:
Find the difference.

    angle = |hourAngle - minuteAngle|

Step 5:
Find the smaller angle.

    smallerAngle = min(angle, 360 - angle)

Step 6:
Print the result.

Example:

Input:
Hours = 3
Minutes = 30

Hour hand:
3 × 30 + 30 × 0.5
= 90 + 15
= 105°

Minute hand:
30 × 6
= 180°

Difference:
|105 - 180|
= 75°

Smaller angle:
min(75, 285)
= 75°

Output:
75.0

Time Complexity:
O(1)

Space Complexity:
O(1)
*/


import java.util.Scanner;

public class FindSmallerAngleInClock {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Hours : ");
        int hours=scanner.nextInt();
        System.out.print("Enter minutes : ");
        int minutes=scanner.nextInt();
        double hoursAngle=(hours%12)*30+(minutes*0.5);
        double minutesAngle=minutes*6;
        double angle=Math.abs( hoursAngle-minutesAngle);
        double smallerAngle=Math.min(angle,360-angle);
        System.out.println(smallerAngle);
    }
}
