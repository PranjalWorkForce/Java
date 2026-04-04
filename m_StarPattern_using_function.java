public class m_StarPattern_using_function {
    static void square(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 6){
                    System.out.print("* ");
                }
                else {

                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    static void rightAngleTriangle(){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        square();
        rightAngleTriangle();
    }
}
