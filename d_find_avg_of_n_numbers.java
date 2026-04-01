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

# This program calculates the average of n numbers entered by the user
# Scanner is used to take input from the keyboard
# User first enters how many numbers (n) they want to input
# An array is created to store those numbers
# A variable 'sum' is used to store the total of all numbers
# A loop runs from 1 to n to take each number as input
# Each number is stored in the array using index (i-1)
# At the same time, each number is added to 'sum'
# After the loop, average is calculated using formula: sum / n
# Finally, the average is printed on the screen
