/*
Problem 8: Take a temperature value and print
"Cold", "Warm", or "Hot" using range conditions.

Input:
5

Output:
Cold

Input:
20

Output:
Warm

Input:
40

Output:
Hot

Topics Involved:
- Conditional statements (if, else if, else)
- Range conditions

Logic:
- If temperature is less than 10 → Cold.
- If temperature is between 10 and 30 → Warm.
- Otherwise → Hot.
*/
    import java.util.Scanner;

    public class TemparatureCheck{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter temperature in Celsius: ");
            double temp = sc.nextDouble();

            if (temp < 10) {
                System.out.println("Cold");
            } else if (temp <= 30) {
                System.out.println("Warm");
            } else {
                System.out.println("Hot");
            }



    }
}
