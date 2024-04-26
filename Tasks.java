public class Tasks {
    public static void main(String[] args) {

        // Task 1
        int a = 10;
        if (a > 18) {
            System.err.println("The variable is greater than 18");
        } else {
            System.err.println("The variable is not greater than 18");
        }

        // Task 2
        int amount = 100;
        int time = 2;
        int rate = 6;

        System.out.println("The simple interest is " + (amount * time * rate) / 100);

        // Task 3
        int length = 20;
        int breadth = 10;
        int parameter = 2 * (length + breadth);
        int area = length * breadth;
        System.out.println("The parameter of ractangle is " + parameter);
        System.out.println("The area of ractangle is " + area);

        // Task 4
        int number = 10;
        boolean isTrue = number >= 18;
        System.out.println(isTrue ? "Is greater than 18" : "Is smaller than 18");

    }
}
