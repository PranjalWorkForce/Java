//               +       __________
// Formula =  -b -  \/ b/\2 - 4ac
//             ----------------------
//                      2a

import java.util.Scanner;

public class h_quadratic_equation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        double under_root_value = (b * b) - (4 * a * c);

        if (under_root_value > 0.0) {
            double r1 = (-b + Math.pow(under_root_value, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(under_root_value, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (under_root_value == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
