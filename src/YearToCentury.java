/*
Problem 50 : Take a year and print the corresponding century.

Sample Input 1:
Enter a year: 1905

Sample Output 1:
1905 belongs to the 20th century

--------------------------------------------------

Sample Input 2:
Enter a year: 2000

Sample Output 2:
2000 belongs to the 20th century

--------------------------------------------------

Sample Input 3:
Enter a year: 2001

Sample Output 3:
2001 belongs to the 21st century

--------------------------------------------------

Sample Input 4:
Enter a year: 100

Sample Output 4:
100 belongs to the 1st century

--------------------------------------------------

Topics Involved:
- Integer arithmetic
- Division (/)
- Operator precedence
- Mathematical formula
- User input using Scanner

Logic:

Step 1:
Take a year as input.

Step 2:
Use the formula:

    century = (year - 1) / 100 + 1

Step 3:
Print the century.

Explanation:

Years 1–100      → 1st century
Years 101–200    → 2nd century
Years 1901–2000  → 20th century
Years 2001–2100  → 21st century

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
    import java.util.Scanner;

    public class YearToCentury {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            int century = (year - 1) / 100 + 1;

            System.out.println(year + " belongs to the " + century + "th century");
        }
    }


