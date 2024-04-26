import java.util.Scanner;

public class InputTask {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myObj.nextLine();

        System.out.print("are you over 18?(true/false):  ");
        boolean age = myObj.nextBoolean();
        String overEighteen = age?"You are over 18": "you are not over 18";

        System.out.print("How many sibilings do you have: ");
        int sibilings = myObj.nextInt();
        

        System.out.printf("Hi, %s you are %s and you have %d",name,overEighteen,sibilings);


    }
}
