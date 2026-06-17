/*
Problem 13: Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

Sample Input and Output:

Input 1:
95

Output:
Grade A

Input 2:
85

Output:
Grade B

Input 3:
72

Output:
Grade C

Input 4:
65

Output:
Grade D

Input 5:
45

Output:
Grade F

Input 6:
120

Output:
Invalid Marks

Topics Involved:
- Conditional statements (if, else if, else)
- Logical OR operator (||)
- Relational operators (>=, <, >)

Logic:
Step 1:
Take marks as input.

Step 2:
Check whether marks are valid (0–100).
- If marks < 0 or marks > 100, print "Invalid Marks".

Step 3:
Determine the grade:
- marks >= 90 → Grade A
- marks >= 80 → Grade B
- marks >= 70 → Grade C
- marks >= 60 → Grade D
- otherwise → Grade F
*/
import java.util.Scanner;

public class MarksGrading {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Marks = ");
        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        }else if (marks>=90){
            System.out.println("Grade A");
        }else if (marks >= 80 ){
            System.out.println("Grade B");
        }else if (marks >= 70 ){
            System.out.println("Grade C");
        }else if (marks >= 60 ){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
