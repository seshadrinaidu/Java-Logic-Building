/*
Problem 28 : Check if a number lies within the range [100, 999].

Sample Input 1:
100

Sample Output 1:
Number Lies within the range [100,999]

Sample Input 2:
567

Sample Output 2:
Number Lies within the range [100,999]

Sample Input 3:
99

Sample Output 3:
Not within the range

Sample Input 4:
1000

Sample Output 4:
Not within the range

Topics Involved:
- Conditional statements (if, else)
- Relational operators (>=, <=)
- Logical AND operator (&&)
- Range checking

Logic:
Step 1:
Take input number n.

Step 2:
Check whether the number lies between 100 and 999 (inclusive).

Condition:
n >= 100 && n <= 999

Step 3:
- If the condition is true,
  print "Number Lies within the range [100,999]".

- Otherwise,
  print "Not within the range".

Visualization:

100 --------------------- 999
|                           |
✓ Included                  ✓ Included

99                          1000
✗ Outside                   ✗ Outside

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class CheckNumberRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        if (n>=100 && n<=999 ){
            System.out.println("Number Lies within the range [100,999]");
        }else{
            System.out.println("Not within the range");
        }
    }
}
