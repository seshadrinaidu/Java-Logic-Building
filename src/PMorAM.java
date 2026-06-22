/*
Problem 34 : Take 24-hour time (hours and minutes) and print whether it is AM or PM.

Sample Input 1:
Enter hours(0-23) : 8

Sample Output 1:
AM

Sample Input 2:
Enter hours(0-23) : 15

Sample Output 2:
PM

Sample Input 3:
Enter hours(0-23) : 23

Sample Output 3:
PM

Sample Input 4:
Enter hours(0-23) : 25

Sample Output 4:
Invalid Hours

Topics Involved:
- Conditional statements (if, else if, else)
- Relational operators (>=, <)
- Range checking
- 24-hour time format

Logic:

Step 1:
Take the hour as input.

Step 2:
Check whether the hour is between 0 and 11.

Condition:
t >= 0 && t < 12

- If true, print "AM".

Step 3:
Otherwise, check whether the hour is between 12 and 23.

Condition:
t >= 12 && t < 24

- If true, print "PM".

Step 4:
Otherwise,

- Print "Invalid Hours".

Flow:

Take Hour
    ↓
0 ≤ hour < 12 ?
    ↓
Yes → AM
    ↓ No
12 ≤ hour < 24 ?
    ↓
Yes → PM
    ↓ No
Invalid Hours

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class PMorAM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours(0-23) : ");
        int t=scanner.nextInt();
        if (t>=0 && t<12){
            System.out.println("AM");
        }else if (t>=12 && t<24){
            System.out.println("PM");
        }else{
            System.out.println("Invalid Hours");
        }
    }
}
