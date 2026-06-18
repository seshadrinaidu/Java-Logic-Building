/*
Problem 19: Take a day number (1–7) and print the corresponding day name.

Input 1:
1

Output:
Monday

Input 2:
5

Output:
Friday

Input 3:
7

Output:
Sunday

Input 4:
0

Output:
Invalid Day Number

Input 5:
8

Output:
Invalid Day Number

Topics Involved:
- Conditional statements (if, else)
- Switch statement
- Case labels
- break statement
- Logical OR operator (||)

Logic:
Step 1:
Take day number as input.

Step 2:
Check whether the day number is valid.
- If dayNumber <= 0 or dayNumber > 7
    print "Invalid Day Number".

Step 3:
Otherwise, use switch statement.
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
*/
import java.util.Scanner;

public class FindDayName {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day Number = ");
        int dayNumber=scanner.nextInt();
        if (dayNumber<=0 || dayNumber >7){
            System.out.println("Invalid Day Number");
        }else {
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
