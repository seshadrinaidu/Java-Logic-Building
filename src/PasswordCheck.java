/*
Problem 40 : Take a password string and check basic rules
(length ≥ 8 and contains at least one digit).

Sample Input 1:
Enter Password : abc12345

Sample Output 1:
Password is Valid

--------------------------------------------------

Sample Input 2:
Enter Password : password

Sample Output 2:
Invalid Password

Explanation:
Length is 8 but contains no digit.

--------------------------------------------------

Sample Input 3:
Enter Password : abc12

Sample Output 3:
Invalid Password

Explanation:
Contains digits but length is less than 8.

--------------------------------------------------

Sample Input 4:
Enter Password : Java2026

Sample Output 4:
Password is Valid

--------------------------------------------------

Topics Involved:
- Strings
- Loops (for loop)
- Conditional statements (if, else)
- Character class methods
- Boolean variables
- String length checking

Logic:

Step 1:
Take the password as input.

Step 2:
Create a boolean variable:

    hasDigits = false

Step 3:
Traverse each character of the password.

Step 4:
Check whether the current character is a digit.

    Character.isDigit(password.charAt(i))

If found:
    hasDigits = true
    break

Step 5:
After the loop, check:

    password.length() >= 8 && hasDigits

Step 6:
If true:
    Print "Password is Valid"

Otherwise:
    Print "Invalid Password"

Example:

Input:
password = "Java2026"

Length:
8

Digits Present:
2, 0, 2, 6

Conditions:
length >= 8  → true
hasDigits    → true

Output:
Password is Valid

Time Complexity:
O(n)

Space Complexity:
O(1)

where n = length of password
*/
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password=scanner.nextLine();
        boolean hasDigits=false;
        for (int i=0;i<password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                hasDigits=true;
                break;
            }
        }
        if (password.length()>=8 && hasDigits){
            System.out.println("Password is Valid");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
