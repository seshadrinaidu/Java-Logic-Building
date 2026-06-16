/*
Problem 5: Check if a given year is a leap year or not.

Input 1: 1900
Output : 1900 is not a Leap Year

Input 2: 2012
Output : 2012 is a Leap Year

Topics Involved:
- Conditional statements (if, else, nested if)
- Boolean variables

Logic:
- If year is divisible by 4:
    - If year is divisible by 100:
        - If year is divisible by 400 → Leap Year
        - Else → Not a Leap Year
    - Else → Leap Year
- Else → Not a Leap Year
*/
import java.util.*;
public class LeapYearOrNot {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter year= ");
        int year= scanner.nextInt();
        boolean leap=false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap=true;
                }else {
                    leap=false;
                }
            }
            else {
                leap=true;
            }
        }else {
            leap=false;
        }
        if (leap) {
            System.out.println(year+" is a Leap year");
        }else{
            System.out.println(year+" is not a Leap year");
        }
    }
}
