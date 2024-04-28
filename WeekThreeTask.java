import java.util.Scanner;

public class WeekThreeTask {
    public static void main(String[] args) {

        // greatest among three numbers
        int a = 100, b = 30, c = 60;
        if (a > b && a > c) {
        System.out.println(a + " is greatest");
        } else if (b > a && b > c) {
        System.out.println(b + " is greatest");
        } else {
        System.out.println(c + " is greatest");
        }

        // check if number is negative positive or zero

        int num = 20;
        if (num == 0) {
        System.out.println("The number is zero");
        } else if (num < 0) {
        System.out.println("The number is negative");
        } else {
        System.out.println("The number is positive");
        }

        // check if the number is divisible by 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
        System.out.println("The number is divisible by 5 and 11");
        } else {
        System.out.println("The number is not divisible by 5 and 11");
        }

        // check if the number is even or odd
        if (num % 2 == 0) {
        System.out.println("Even");
        } else {
        System.out.println("Odd");
        }

        // check if leap year
        int year = 2002;
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
        System.out.println("Leap year");
        } else {
        System.out.println("Not a leap year");
        }

        // check if vowel
        char word = 'r';

        switch (word) {
        case 'a':
        System.out.println("Vowel");
        break;

        case 'e':
        System.out.println("Vowel");
        break;

        case 'i':
        System.out.println("Vowel");
        break;

        case 'o':
        System.out.println("Vowel");
        break;

        case 'u':
        System.out.println("Vowel");
        break;

        default:
        System.out.println("Consonent");
        break;
        }

        // returns a GPA from grade
        char grade = 'A';
        switch (grade) {
        case 'A':
        System.out.println("90+ GPA");
        break;
        case 'B':
        System.out.println("70-80 GPA");
        break;
        case 'C':
        System.out.println("50-60 GPA");
        break;
        case 'D':
        System.out.println("30-40 GPA");
        break;
        case 'E':
        System.out.println("Fail");
        break;
        case 'F':
        System.out.println("Fail");
        break;

        default:
        break;
        }

        // calculator of two number
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter first number");
        int first = myObj.nextInt();

        System.out.print("Enter second number");
        int second = myObj.nextInt();

        System.out.println("Enter a operation you want to perform (+, -, *, %, /)");
        char sign = myObj.next().charAt(0);

        if (sign == '+') {
            System.out.println(first + second);
        } else if (sign == '-') {
            System.out.println(first - second);
        } else if (sign == '*') {
            System.out.println(first * second);
        } else {
            System.out.println(first / second);
        }

        // print season corresponding to month

        int month = 10;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Invalid month");
                break;
        }

        System.out.println("Enter shape you want calculate the area: \n1:circle \n2:square \n3:triangle\n4:rectangle");
        int shape = myObj.nextInt();
        myObj.nextLine();

        switch (shape) {
            case 1:
                System.out.println("Enter radius: ");
                int radius = myObj.nextInt();
                System.out.println(3.1415 * radius);

                break;

            case 2:
                System.out.println("Enter length: ");
                int length = myObj.nextInt();
                System.out.println(length * length);

                break;
            case 3:
                System.out.println("Enter base: ");
                int base = myObj.nextInt();
                System.out.println("Enter height: ");
                int height = myObj.nextInt();
                System.out.println(1/2*base*height);

                break;
            case 4:
                System.out.println("Enter length: ");
                int rLength = myObj.nextInt();
                System.out.println("Enter breadth: ");
                int breadth = myObj.nextInt();
                System.out.println(rLength*breadth);

            default:
                break;
        }

    }
}
