/*
Problem 16: Check voting eligibility for given age

Input 1:
17

Output:
Not Eligible for Voting

Input 2:
18

Output:
Eligible for Voting

Input 3:
30

Output:
Eligible for Voting

Topics Involved:
- Conditional statements (if, else)
- Relational operators (<, >=)

Logic:
- Take input age.
- Check whether age is less than 18.
    - If age < 18
        - Print "Not Eligible for Voting".
    - Otherwise
        - Print "Eligible for Voting".
*/
import java.util.Scanner;

public class VoteEligibilityCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age = ");
        int age=scanner.nextInt();
        if (age < 18){
            System.out.println("Not Eligible for Voting");
        }else{
            System.out.println("Eligible for Voting");
        }
    }
}
