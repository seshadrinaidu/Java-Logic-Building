/*
Problem 1: Take a number and print whether it's positive,negative or zero
input -> output
1     -> positive
0     -> zero
-2    -> negative
topics involved:
  -conditional statements(if & if else & else)
 */

import java.util.*;
public class CheckPositiveOrNegative {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number= ");
        int number=scanner.nextInt();
        if (number==0){
            System.out.println(number+" is Zero");
        }else if (number<0){
            System.out.println(number+" is Negative");
        }else{
            System.out.println(number+" is Positive");
        }
    }
}
