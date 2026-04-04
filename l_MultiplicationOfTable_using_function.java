import java.util.Scanner;

public class l_MultiplicationOfTable_using_function {
    static void table(int num){

        System.out.println("the table of "+num+ "is bellow");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);

    }
}
