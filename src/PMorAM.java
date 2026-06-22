import java.util.Scanner;

public class PMorAM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours(0-23) : ");
        int t=scanner.nextInt();
        if (t>=0 && t<12){
            System.out.println("AM");
        }else if (t>=12 && t<24){
            System.out.println("PM");
        }else{
            System.out.println("Invalid Hours");
        }
    }
}
