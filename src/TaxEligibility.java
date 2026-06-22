/*
Problem 35 : Take income and age, and check if eligible for tax
(age > 18 and income > 5 Lakh).

Sample Input 1:
Age : 25
Income : 700000

Sample Output 1:
Eligible for Tax

Sample Input 2:
Age : 17
Income : 800000

Sample Output 2:
Not Eligible

Sample Input 3:
Age : 30
Income : 400000

Sample Output 3:
Not Eligible

Topics Involved:
- Conditional statements (if, else)
- Logical AND operator (&&)
- Relational operators (>)
- Multiple condition checking

Logic:

Step 1:
Take age and income as input.

Step 2:
Check the following condition:

age > 18 && income > 500000

Step 3:
- If both conditions are true,
  print "Eligible for Tax".

- Otherwise,
  print "Not Eligible".

Flow:

Take Age and Income
        ↓
age > 18 AND income > 500000 ?
        ↓
      Yes → Eligible for Tax
        ↓ No
      Not Eligible

Time Complexity:
O(1)

Space Complexity:
O(1)
*/

import java.util.Scanner;

public class TaxEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age : ");
        int age=scanner.nextInt();

        System.out.print("Income : ");
        int income=scanner.nextInt();
        if (age>18 && income>500000){
            System.out.println("Eligible for Tax");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
