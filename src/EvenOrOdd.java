/*
Problem 2: Check if a number is even or odd
input -> output
   1  -> Odd
   2  -> Even
   0  -> Zero
Topics Involved:
  - conditional statements( if & if else)
 */
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number= ");
        int number=scanner.nextInt();

         if (number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+" is Odd");
        }
    }
}
