/*
Problem 49 : Take two dates (day and month) and determine
which one comes first in the calendar.

Sample Input 1:
Enter first day : 10
Enter first month : 5

Enter second day : 15
Enter second month : 5

Sample Output 1:
First date comes earlier.

Explanation:
Both dates are in May.
10 < 15.

--------------------------------------------------

Sample Input 2:
Enter first day : 25
Enter first month : 8

Enter second day : 10
Enter second month : 9

Sample Output 2:
First date comes earlier.

Explanation:
August comes before September.

--------------------------------------------------

Sample Input 3:
Enter first day : 18
Enter first month : 11

Enter second day : 12
Enter second month : 10

Sample Output 3:
Second date comes earlier.

Explanation:
October comes before November.

--------------------------------------------------

Sample Input 4:
Enter first day : 20
Enter first month : 6

Enter second day : 20
Enter second month : 6

Sample Output 4:
Both dates are the same.

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else if, else)
- Logical operators (&&, ||)
- Relational operators (<, >, ==)
- Nested comparisons
- User input using Scanner
- Date comparison logic

Logic:

Step 1:
Take the first date (day and month).

Step 2:
Take the second date (day and month).

Step 3:
Compare the months.

If:
    month1 < month2
Then:
    First date comes earlier.

Step 4:
If both months are equal,
compare the days.

If:
    day1 < day2
Then:
    First date comes earlier.

Step 5:
Similarly, check if the second date comes earlier.

Step 6:
If both day and month are equal,
print "Both dates are the same."

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First date
        System.out.print("Enter first day: ");
        int day1 = sc.nextInt();
        System.out.print("Enter first month: ");
        int month1 = sc.nextInt();

        // Second date
        System.out.print("Enter second day: ");
        int day2 = sc.nextInt();
        System.out.print("Enter second month: ");
        int month2 = sc.nextInt();

        // Compare


        if (month1 < month2 || (month1 == month2 && day1 < day2)) {
            System.out.println("First date comes earlier.");
        } else if (month1 > month2 || (month1 == month2 && day1 > day2)) {
            System.out.println("Second date comes earlier.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}

