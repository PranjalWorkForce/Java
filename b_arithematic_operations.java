import java.util.Scanner;

public class b_arithematic_operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();

        int sum = a + b;
        int differentiate = a - b;
        int product = a * b;
        int quotient = a / b;
        System.out.println("The sum of and b is : " + sum);
        System.out.println("The differentiate  of and b is : " + differentiate );
        System.out.println("The product of and b is : " + product);
        System.out.println("The quotient of and b is : " + quotient);
    }
}
