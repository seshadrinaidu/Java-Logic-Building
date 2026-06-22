/*
Problem 31 : Take a character and check if it is a letter, a digit, or a special character.

Sample Input 1:
A

Sample Output 1:
Letter

Sample Input 2:
m

Sample Output 2:
Letter

Sample Input 3:
7

Sample Output 3:
Digit

Sample Input 4:
@

Sample Output 4:
Special character

Topics Involved:
- Conditional statements (if, else if, else)
- Logical operators (&&, ||)
- Relational operators (>=, <=)
- Character data type
- Character comparison

Logic:

Step 1:
Take a character as input.

Step 2:
Check whether the character is an alphabet.

Condition:
(ch >= 'a' && ch <= 'z') ||
(ch >= 'A' && ch <= 'Z')

- If true, print "Letter".

Step 3:
Otherwise, check whether the character is a digit.

Condition:
(ch >= '0' && ch <= '9')

- If true, print "Digit".

Step 4:
Otherwise,

- Print "Special character".

Flow:

Take Character
       ↓
Is it a-z or A-Z ?
       ↓
     Yes → Letter
       ↓ No
Is it 0-9 ?
       ↓
     Yes → Digit
       ↓ No
Special Character

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class CheckLetterOrCharacter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch=scanner.nextLine().charAt(0);
        if (ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
            System.out.println("Letter");
        }else if (ch >= '0' && ch<='9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special character");
        }
    }
}
