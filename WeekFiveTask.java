import java.util.Scanner;

public class WeekFiveTask {
    public static void main(String[] args) {

        // // is eligable to vote
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age1 = myObj.nextInt();
        System.out.println(age1 < 18 ? "You cannot vote" : "You can vote");

        // simple interest calculator
        int p = 100;
        float t = 2.5f;
        float r = 7.1f;

        int si = (int) ((p * t * r) / 100);
        System.out.println("Simple interest" + si);

        // area calculator
        float length = 10f;
        float width = 20f;
        float height = 12f;
        float base = 30;

        float side = 30f;

        float areaOfCuboid = length * width * height;
        System.out.println(areaOfCuboid);

        double volumeOfCuboid = Math.pow(side, 3);
        System.out.println(volumeOfCuboid);

        float areaOfTriangle = (base * height) / 2;
        System.out.println(areaOfTriangle);


        // sum and product of two different numbers
        System.out.println("Enter first number: ");
        int a = myObj.nextInt();

        System.out.println("Enter second number: ");
        int b = myObj.nextInt();

        int sum = a + b;
        System.out.println("Sum=" + sum);

        int product = a * b;
        System.out.println("Product" + product);

        float division = (float)a/b;
        System.out.println(division);


        // print string by concanating with other string

        System.out.println("Enter your name: ");
        String name  = myObj.nextLine();

        System.out.println("Enter your roll no: ");
        int roll = myObj.nextInt();

        myObj.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest = myObj.nextLine();

        System.out.println("Hey, my name is "+name +" and my roll number is "+roll+". My field of interest are"+interest+".");

        
        // print grade using trunary opertor
            int math=78;
            int social=91;
            int eng=81;
            int computer=91;
            int total=math+social+eng+computer;
            float percent=total/4;
            String output = percent > 70 ? "first class" : 
                percent > 60 ? "second class" : 
                percent > 50 ? "third class" :
                percent > 40 ? "fourth class" :
                "fail";
            System.out.println(output);
    

    }
}
