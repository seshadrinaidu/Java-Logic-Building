/*
Problem 39 : Take electricity units consumed and calculate
the bill as per slabs (using if-else).

Sample Input 1:
Enter electricity units consumed: 80

Sample Output 1:
Total Bill = ₹400

Explanation:
80 × 5 = ₹400

--------------------------------------------------

Sample Input 2:
Enter electricity units consumed: 150

Sample Output 2:
Total Bill = ₹850

Explanation:
First 100 units  = 100 × 5 = ₹500
Next 50 units    = 50 × 7  = ₹350

Total Bill = ₹850

--------------------------------------------------

Sample Input 3:
Enter electricity units consumed: 250

Sample Output 3:
Total Bill = ₹1700

Explanation:
First 100 units  = 100 × 5  = ₹500
Next 100 units   = 100 × 7  = ₹700
Remaining 50     = 50 × 10  = ₹500

Total Bill = ₹1700

--------------------------------------------------

Topics Involved:
- Conditional statements (if, else if, else)
- Arithmetic operators (*, +, -)
- Slab-based calculations
- User input using Scanner

Logic:

Step 1:
Take the number of units consumed as input.

Step 2:
If units are less than or equal to 100:

    bill = units × 5

Step 3:
If units are between 101 and 200:

    bill = (100 × 5)
         + (units - 100) × 7

Step 4:
If units are greater than 200:

    bill = (100 × 5)
         + (100 × 7)
         + (units - 200) × 10

Step 5:
Print the total bill amount.

Example:

Input:
units = 250

Calculation:

First 100 units:
100 × 5 = 500

Next 100 units:
100 × 7 = 700

Remaining 50 units:
50 × 10 = 500

Total Bill:
500 + 700 + 500 = ₹1700

Output:
Total Bill = ₹1700

Time Complexity:
O(1)

Space Complexity:
O(1)
*/
    import java.util.Scanner;

    public class ElectricityBill {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter electricity units consumed: ");
            int units = sc.nextInt();
            int bill = 0;

            if (units <= 100) {
                bill = units * 5;
            } else if (units <= 200) {
                bill = (100 * 5) + (units - 100) * 7;
            } else {
                bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }

            System.out.println("Total Bill = ₹" + bill);
        }


}
