import java.util.Scanner;

public class f_positive_or_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int num = sc.nextInt();

        if (num >=0 ) {
            System.out.println("The number you gave is positive");
        }
        else {
            System.out.println("The number you gave is negative");
        }
    }
}
