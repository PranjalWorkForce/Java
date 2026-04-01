import java.util.Scanner;

public class d_find_avg_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to input to get an average of :  ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;

        for(int i = 1; i <= n; i++ ){
            System.out.print("Enter the " + i + " number ");
            num[i-1] = sc.nextInt();
            sum += num[i-1] ;
        }

        int avg = sum/n;
        System.out.println("The avg of all numbers you entered is : " + avg);


    }
}
