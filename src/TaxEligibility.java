import java.util.Scanner;

public class TaxEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age : ");
        int age=scanner.nextInt();

        System.out.print("Income : ");
        int income=scanner.nextInt();
        if (age>18 && income>50000){
            System.out.println("Eligible for Tax");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
