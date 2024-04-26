public class OnlyOutput {
    public static void main(String[] args) {
        // prints a line with line break use "sout" shortcut
        System.out.println("This print and breaks line");

        // prints a line without braking the line
        System.out.print("This prints and doesn't breaks line");
        System.out.print("This will continue in same line\n");

        // output formatting
        int num = 10;
        String word = "New word";
        boolean isTrue = true;
        System.out.printf("The next word is %s",word);
        System.out.printf("The next number is %d", num);

        System.out.printf("The next word is %s,\n next number is %d\n and boolean is %b",word,num,isTrue);





    }
}
