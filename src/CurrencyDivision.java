/*
Problem 27: Check if an amount can be evenly divided into
2000, 500, and 100 currency notes.

Input 1:
5600

Output:
2000 Notes = 2
500 Notes = 3
100 Notes = 1

Input 2:
5550

Output:
Amount cannot be evenly divided

Topics Involved:
- Conditional statements (if, else)
- Integer division (/)
- Modulus operator (%)
- Greedy approach

Logic:
1. Take the amount.
2. Check if amount is divisible by 100.
   - If not, print "Amount cannot be evenly divided".
3. Find number of 2000 notes.
4. Find remaining amount.
5. Find number of 500 notes.
6. Find remaining amount.
7. Find number of 100 notes.
*/
import java.util.Scanner;

public class CurrencyDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = scanner.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Amount cannot be evenly divided");
        } else {
            int notes2000 = amount / 2000;
            amount = amount % 2000;

            int notes500 = amount / 500;
            amount = amount % 500;

            int notes100 = amount / 100;

            System.out.println("2000 Notes = " + notes2000);
            System.out.println("500 Notes = " + notes500);
            System.out.println("100 Notes = " + notes100);
        }
    }
}