public class NestedIfStatement {
    public static void main(String[] args) {
        int num1 = -10, num2 = 20;
        if (num1 < 0) {
            if (num1 > num2) {
                System.out.println("Num1 is negative and greater");
            } else {
                System.out.println("Num1 is negative and lesser");
            }
        } else {
            if (num1 > num2) {
                System.out.println("Num1 is positive and greater");
            } else {
                System.out.println("Num1 is positive and lesser");
            }
        }
    }
}
