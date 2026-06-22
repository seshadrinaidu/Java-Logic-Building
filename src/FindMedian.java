/*
Problem 33 : Take three numbers and print the median value
(neither maximum nor minimum).

Sample Input 1:
Enter first Number : 10
Enter second Number : 30
Enter Third Number : 20

Sample Output 1:
Median is : 20

Sample Input 2:
Enter first Number : 50
Enter second Number : 10
Enter Third Number : 30

Sample Output 2:
Median is : 30

Sample Input 3:
Enter first Number : 5
Enter second Number : 15
Enter Third Number : 25

Sample Output 3:
Median is : 15

Sample Input 4:
Enter first Number : 40
Enter second Number : 20
Enter Third Number : 10

Sample Output 4:
Median is : 20

Topics Involved:
- Conditional statements (if, else if, else)
- Logical operators (&&, ||)
- Relational operators (>=, <=)
- Compound conditions
- Comparing multiple values

Logic:

Step 1:
Take three numbers a, b, and c as input.

Step 2:
Check whether a lies between b and c.

Condition:
(a >= b && a <= c) || (a <= b && a >= c)

- If true, assign:
    median = a

Step 3:
Otherwise, check whether b lies between a and c.

Condition:
(b >= a && b <= c) || (b <= a && b >= c)

- If true, assign:
    median = b

Step 4:
Otherwise,

- Assign:
    median = c

Step 5:
Print the median value.

Visualization:

Example:
a = 10
b = 30
c = 20

10 ---- 20 ---- 30
Min   Median   Max

Median = 20

Time Complexity:
O(1)

Space Complexity:
O(1)
*/


import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter second Number : ");
        int b=scanner.nextInt();
        System.out.print("Enter Third Number : ");
        int c=scanner.nextInt();
        int median;
        if ((a>=b && a<=c) ||(a<=b && a>=c)){
            median=a;
        }else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        }else{
            median=c;
        }
        System.out.println("Median is : "+median);
    }
}
