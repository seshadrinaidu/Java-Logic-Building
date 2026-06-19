/*
/*
Problem 23: Take a four-digit number and check whether the
first and last digits are equal.

Input 1:
1221

Output:
1, 1 Both are equal

Input 2:
1234

Output:
1, 4 Both are different

Topics Involved:
- Arithmetic operators
- Modulus operator (%)
- Integer division (/)
- Conditional statements (if, else)
- Digit extraction

Logic:
1. Take a four-digit number.
2. Extract all digits.
3. Compare the first digit and last digit.
4. If they are equal, print "Both are equal".
5. Otherwise, print "Both are different".
*/


import java.util.Scanner;

public class checkIfFirstandLastEqual {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Four Digit Number : ");
        int n = scanner.nextInt();
        int a = n/1000;
        int b = (n/100)%10;
        int c = (n/10)%10;
        int d =n%10;

        if (a==d){
            System.out.println(a+" , "+d+" Both are equal");
        }else{
            System.out.println(a+" ,"+d+" Both are different");
        }
    }
}
