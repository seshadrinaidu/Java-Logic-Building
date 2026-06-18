/*
Problem 18: Take an alphabet character and check whether it
lies between 'a' and 'm' or between 'n' and 'z'.

Input 1:
a

Output:
a lies between a and m

Input 2:
g

Output:
g lies between a and m

Input 3:
s

Output:
s lies between n and z

Input 4:
z

Output:
z lies between n and z

Input 5:
A

Output:
Invalid Input

Input 6:
5

Output:
Invalid Input

Topics Involved:
- Conditional statements (if, else if, else)
- Logical AND operator (&&)
- Relational operators (>=, <=)
- Character data type
- Character comparison using ASCII values

Logic:
Step 1:
Take a character as input.

Step 2:
Check whether the character lies between 'a' and 'm'.
- If yes, print "lies between a and m".

Step 3:
Otherwise, check whether the character lies between 'n' and 'z'.
- If yes, print "lies between n and z".

Step 4:
Otherwise, print "Invalid Input".
*/
import java.util.Scanner;

public class DetermineCharacter {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter a Character = ");
        char ch=scanner.next().charAt(0);
        if (ch >= 'a' && ch <= 'm'){
            System.out.println(ch+" lies between a and m");
        }else if(ch >= 'n' && ch <= 'z') {
            System.out.println(ch+" lies between n and z");
        }else{
            System.out.println("Invalid inout");
        }

    }
}
