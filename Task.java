import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);


        System.out.print("Enter your marks for nepali: ");
        int nepali = myObj.nextInt();

        System.out.print("Enter your marks for english: ");
        int english = myObj.nextInt();

        System.out.print("Enter your marks for math: ");
        int  math = myObj.nextInt();

        if(nepali<35 || english<35 || math<35){
            System.out.println("You have failed in one or more module");
            return;
        }
        int average = (nepali+english+math)/3;

        if (average<=60){
            System.out.println("3rd division");
        }
        else if(average<=70){
            System.out.println("2nd Division");
        }
        else{
            System.out.println("1st division");
        }



    }
}
