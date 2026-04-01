import java.util.Scanner;

public class c_multiplication_of_table {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of, which table you want to know: ");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + "=" + num*i);
            }
        }
}
