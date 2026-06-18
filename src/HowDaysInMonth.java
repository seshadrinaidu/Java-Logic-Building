/*
Problem 20: Take a month number (1–12) and print the number
of days in that month (ignore leap years).

Input 1:
1

Output:
31 Days

Input 2:
4

Output:
30 Days

Input 3:
2

Output:
28 Days

Input 4:
15

Output:
Invalid Month Number

Topics Involved:
- Switch statement
- Case labels
- break statement
- default case
- Grouping multiple cases

Logic:

Step 1:
Take month number as input.

Step 2:
Use switch statement.

Months with 31 days:
1, 3, 5, 7, 8, 10, 12

Months with 30 days:
4, 6, 9, 11

February:
2 → 28 Days

Invalid input:
Print "Invalid Month Number".
*/

import java.util.Scanner;

public class HowDaysInMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month Number (1-12) : ");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            default:
                System.out.println("invalid Month Number");
        }
    }
}
