import java.util.Scanner;

public class e_area_and_perimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What you want to find? \n" +
                "1. Area of Circle \n" +
                "2. Peremeter of Circle \n" +
                "3. Area of Rectangle \n" +
                "4. Peremeter of Rectangle \n" +
                "5. Area of Square \n" +
                "6. Peremeter of Square \n");

        int opt = sc.nextInt();

        float lenght, breath, rad;

        switch(opt) {
            case 1:
                System.out.println("Enter the radious circle : ");
                rad = sc.nextFloat();
                System.out.println("The area of circle is " + 3.14*rad*rad );
                break; // Exits the switch block
            case 2:
                System.out.println("Enter the radious of circle : ");
                rad = sc.nextFloat();
                System.out.println("The peremeter of circle is " + 2*3.14*rad );
                break;
            case 3:
                System.out.println("Enter the lenght of rectangle : ");
                lenght = sc.nextFloat();
                System.out.println("Enter the breath of rectangle : ");
                breath = sc.nextFloat();
                System.out.println("The Area of rectangle is " + lenght * breath);
                break; // Exits the switch block
            case 4:
                System.out.println("Enter the lenght of rectangle : ");
                lenght = sc.nextFloat();
                System.out.println("Enter the breath of rectangle : ");
                breath = sc.nextFloat();
                System.out.println("The Peremeter of rectangle is " + 2*(lenght + breath));
                break;
            case 5:
                System.out.println("Enter the lenght of square : ");
                lenght = sc.nextFloat();
                System.out.println("The Peremeter of square is " + lenght * lenght);
            case 6:
                System.out.println("Enter the lenght square : ");
                lenght = sc.nextFloat();
                System.out.println("The peremeter of square is " + 4*lenght );
                break;
            default:
                System.out.println("Invalid Input!!" );
        }




    }
}
