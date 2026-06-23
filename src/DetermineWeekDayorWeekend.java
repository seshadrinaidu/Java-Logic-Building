/*
Problem 38 : Take a weekday number (1–7) and determine
whether it is a weekday or weekend.

Sample Input 1:
Enter Week Number(1-7) : 1

Sample Output 1:
Week Day

Sample Input 2:
Enter Week Number(1-7) : 5

Sample Output 2:
Week Day

Sample Input 3:
Enter Week Number(1-7) : 6

Sample Output 3:
Weekend

Sample Input 4:
Enter Week Number(1-7) : 7

Sample Output 4:
Weekend

Sample Input 5:
Enter Week Number(1-7) : 10

Sample Output 5:
Invalid Week Day

Topics Involved:
- Conditional statements (if, else if, else)
- Logical AND operator (&&)
- Relational operators (>=, <=)
- Range checking
- User input using Scanner

Logic:

Step 1:
Take a week number as input.

Step 2:
Check whether the number lies between 1 and 5.

Condition:
weekNumber >= 1 && weekNumber <= 5

- If true, print:
  "Week Day"

Step 3:
Otherwise, check whether the number is 6 or 7.

Condition:
weekNumber >= 6 && weekNumber <= 7

- If true, print:
  "Weekend"

Step 4:
Otherwise,

- Print:
  "Invalid Week Day"

Example:

Input:
weekNumber = 6

Check:
6 >= 1 && 6 <= 5 → false

Check:
6 >= 6 && 6 <= 7 → true

Output:
Weekend

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class DetermineWeekDayorWeekend {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Week Number(1-7) : ");
        int weekNumber=scanner.nextInt();


         if (weekNumber>=1 && weekNumber<=5){
            System.out.println("Week Day");
        }else if (weekNumber>=6 && weekNumber<=7){
            System.out.println("Weekend");
        }else{
             System.out.println("Invalid Week Day ");
         }
    }
}
