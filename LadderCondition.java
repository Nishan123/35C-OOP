public class LadderCondition {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        if (num1 < 0) {
            System.out.println("Num1 is negative");

        } else if (num2 < 0) {
            System.out.println("Num2 is negative");
        } else if (num1 == num2) {
            System.out.println("Num1 is equal to num2");
        } else {
            System.out.println("All conditions fails!");
        }
    }
}
