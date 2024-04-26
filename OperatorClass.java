public class OperatorClass {
    public static void main(String[] args) {

        // arthmetic operator
        int a = 40, b = 20;

        System.out.println("The sum is" + (a + b));
        System.out.println("The difference is" + (a - b));
        System.out.println("The division is" + (a / b));
        System.out.println("The modulo is" + (a % b));

        // assignment operator
        int num1;
        num1 = 20;

        System.out.println("Num2 after using += operator is: " + (num1 += 10)); // using += operator
        System.out.println("Num2 after using *= operator is: " + (num1 *= 10)); // using *= operator

        // realtional operator
        int num2 = 9, num3 = 20;

        System.out.println("Is num2 equals to num3 " + (num2 == num3));
        System.out.println("Is num2 smaller than num3 " + (num2 < num3));
        System.out.println("Is num2 greater or equals to num3 " + (num2 >= num3));
        System.out.println("Is num2 not equals to num3 " + (num2 != num3));

        // logical operators
        boolean in = true;
        boolean out = false;
        System.out.println("AND of true and false " + (in && out));
        System.out.println("OR of true and flase " + (in || out));
        System.out.println("NOT of true and false" + (!in));

        // unaru operator
        int uNum = 10;
        uNum ++;
        System.out.println("Unary operator using ++ " + uNum);
        uNum --;
        System.out.println("Unary operator using -- " + uNum);



        // ternary operator
        int number1 =20, number2=30;

        boolean expression1 = number1==number2;

        String result = expression1 ? "True condition":"False condition";


        if (expression1){
            result="True condition";
            System.out.println(result);
        }
        else{
            result="False condition";
            System.out.println(result);

        }


    }
}
