import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter \"True\" or \"False\"");
        boolean isTrue = myObj.nextBoolean();

        if (isTrue){
            System.out.println("Yaeee this is true");

        }
        else{
            System.out.println("This is fasle");
        }


        
    }
}
