import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter second Number : ");
        int b=scanner.nextInt();
        System.out.print("Enter Third Number : ");
        int c=scanner.nextInt();
        int median;
        if ((a>=b && a<=c) ||(a<=b && a>=c)){
            median=a;
        }else if ((b>=a && b<=c) || (b<=a && b>=c)){
            median=c;
        }else{
            median=c;
        }
        System.out.println("Meadian is : "+median);
    }
}
