/*
Problem 43 : Take day and month and check if it forms a valid calendar date
(ignoring leap years).

Sample Input 1:
Enter Day(1-31) : 15
Enter Month(1-12) : 8

Sample Output 1:
Valid

Explanation:
August has 31 days.
15 is between 1 and 31.

--------------------------------------------------

Sample Input 2:
Enter Day(1-31) : 31
Enter Month(1-12) : 4

Sample Output 2:
Invalid

Explanation:
April has only 30 days.

--------------------------------------------------

Sample Input 3:
Enter Day(1-31) : 28
Enter Month(1-12) : 2

Sample Output 3:
Valid

Explanation:
February has 28 days (ignoring leap years).

--------------------------------------------------

Sample Input 4:
Enter Day(1-31) : 29
Enter Month(1-12) : 2

Sample Output 4:
Invalid

Explanation:
February has only 28 days.

--------------------------------------------------

Sample Input 5:
Enter Day(1-31) : 10
Enter Month(1-12) : 13

Sample Output 5:
Invalid

Explanation:
Month must be between 1 and 12.

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else)
- Switch statement
- Range checking
- Logical operators (&&)
- User input using Scanner
- Real-world date validation

Logic:

Step 1:
Take day and month as input.

Step 2:
Check whether the month is valid.

    month >= 1 && month <= 12

If not valid:
    Print "Invalid"

Step 3:
Determine the maximum number of days in the month.

Months with 31 days:
    1, 3, 5, 7, 8, 10, 12

Months with 30 days:
    4, 6, 9, 11

February:
    2 → 28 days

Step 4:
Store the result in maxDays.

Step 5:
Check:

    day >= 1 && day <= maxDays

If true:
    Print "Valid"

Else:
    Print "Invalid"

Example:

Input:
Day = 30
Month = 4

Month 4 = April
maxDays = 30

Check:
30 >= 1 && 30 <= 30

Result:
Valid

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class CheckValidCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day(1-31) : ");
        int day = scanner.nextInt();
        System.out.print("Enter Month(1-12) : ");
        int month = scanner.nextInt();
        int maxDays=0;
        if (month > 0 && month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDays = 30;
                    break;
                case 2:
                    maxDays = 28;
                    break;
            }
            if (day>=1&& day<= maxDays){
                System.out.println("Forms a Valid Calendar");
            }else{
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
