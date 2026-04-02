import java.util.Scanner;

public class i_greatest_among_n_numbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Among how many Numbers you want to frind the greatest one:  :");
        int n = sc.nextInt();

        int[] num = new int[n]; // array

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the " + i + " Number");
            num[i - 1] = sc.nextInt(); // get the n numbers
        }

        int max = num[0]; // assume 1st array as max

        for (int i = 1; i < n; i++) {
            if (num[i] > max) {   // compair [0] with others
                max = num[i];
            }
        }

        System.out.println("The greatest Number is " + max); // print the max number

    }
}
