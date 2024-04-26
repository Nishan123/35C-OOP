import java.util.Scanner;

public class OnlyInput {
    public static void main(String[] args) {

        // scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = myObj.nextInt();

        String isEven= num%2==0?"Even":"Odd";

        System.out.println(isEven);


        System.out.println("Enter true or flase");
        boolean bool = myObj.nextBoolean();
        System.out.println(bool);



    }
}
