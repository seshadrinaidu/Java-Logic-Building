/*
Problem 15: Take the hour of the day (0–23) and print
"Good Morning", "Good Afternoon",
"Good Evening", or "Good Night".

Sample Input and Output:

Input 1:
8

Output:
Good Morning!

Input 2:
14

Output:
Good Afternoon!

Input 3:
18

Output:
Good Evening!

Input 4:
22

Output:
Good Night!

Input 5:
25

Output:
Invalid Hour

Topics Involved:
- Conditional statements (if, else if, else)
- Relational operators (<, >)
- Logical OR operator (||)
- Range-based conditions

Logic:
Step 1:
Take hour as input.

Step 2:
Check whether the hour is valid (0–23).
- If not, print "Invalid Hour".

Step 3:
Determine the greeting:
- 0–11  → Good Morning
- 12–16 → Good Afternoon
- 17–20 → Good Evening
- 21–23 → Good Night
*/
import java.util.Scanner;

public class DetermineDay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hours = ");
        int hour=scanner.nextInt();
        if (hour < 0 || hour > 23){
            System.out.println("Invalid Hour");
        }else if (hour < 12){
            System.out.println("Good Morning!");
        }else if (hour < 17){
            System.out.println("Good Afternoon!");
        }else if (hour < 21){
            System.out.println("Good Evening!");
        }else {
            System.out.println("Good Night!");
        }
    }
}
