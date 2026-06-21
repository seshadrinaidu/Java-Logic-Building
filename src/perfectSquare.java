/*
Problem 30 : Check whether a number is a perfect square
without using the square root function.

Sample Input 1:
25

Sample Output 1:
Perfect Square

Sample Input 2:
16

Sample Output 2:
Perfect Square

Sample Input 3:
20

Sample Output 3:
Not Perfect Square

Topics Involved:
- for loop
- Conditional statements (if, else)
- Boolean variable
- Arithmetic operators (*)
- Comparison operators (==, <=)

Logic:
Step 1:
Take a number n as input.

Step 2:
Initialize a boolean variable:

boolean isPerfect = false;

Step 3:
Traverse from i = 1 while i * i <= n.

Step 4:
For each i, check:

i * i == n

- If true,
    set isPerfect = true
    and stop the loop.

Step 5:
After the loop,
- If isPerfect is true,
    print "Perfect Square".
- Otherwise,
    print "Not Perfect Square".

Example:

n = 25

i = 1 → 1×1 = 1
i = 2 → 2×2 = 4
i = 3 → 3×3 = 9
i = 4 → 4×4 = 16
i = 5 → 5×5 = 25

25 == 25 → Perfect Square

Time Complexity:
O(√n)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        boolean isPerfect = false;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }


            if (isPerfect) {
                System.out.println("Perfect Square");
            } else {
                System.out.println("Not Perfect Square");
            }

    }
}
