/*
Problem 42 : Take three numbers and check if they can form a
Pythagorean Triplet.

Sample Input 1:
Enter first number : 3
Enter second number : 4
Enter third number : 5

Sample Output 1:
Form a Pythagorean triplet

Explanation:
3² + 4² = 5²
9 + 16 = 25

--------------------------------------------------

Sample Input 2:
Enter first number : 5
Enter second number : 12
Enter third number : 13

Sample Output 2:
Form a Pythagorean triplet

Explanation:
5² + 12² = 13²
25 + 144 = 169

--------------------------------------------------

Sample Input 3:
Enter first number : 2
Enter second number : 3
Enter third number : 4

Sample Output 3:
Does not form a Pythagorean triplet

Explanation:
2² + 3² = 13
4² = 16

13 ≠ 16

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else if, else)
- Mathematical calculations
- Pythagorean theorem
- Math.max()
- Variables and comparisons
- User input using Scanner

Logic:

Step 1:
Take three numbers as input.

Step 2:
Find the largest number.

    max = largest of a, b, c

Step 3:
Store the remaining two numbers in x and y.

Step 4:
Apply the Pythagorean condition:

    max² = x² + y²

Step 5:
If the condition is true:

    Print "Form a Pythagorean triplet"

Otherwise:

    Print "Does not form a Pythagorean triplet"

Example:

Input:
3 4 5

Largest number:
5

Check:
5² = 3² + 4²

25 = 9 + 16

25 = 25

Output:
Form a Pythagorean triplet

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=scanner.nextInt();
        System.out.print("Enter second number : ");
        int b=scanner.nextInt();
        System.out.print("Enter third number : ");
        int c=scanner.nextInt();
        int max=Math.max(a,Math.max(b,c));

        int x,y;
        if (max==a){
            x=b;
            y=c;
        }else if (max==b){
            x=a;
            y=c;
        }else {
            x=a;
            y=b;
        }
        if (max*max==(x*x)+(y*y)){
            System.out.println("Form a Pythagorean triplet");
        }else{
            System.out.println("Does not form a Pythagorean triplet");
        }
    }
}
