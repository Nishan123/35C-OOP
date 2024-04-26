public class JavaArgument {
    public static void main(String[] args) {
        // This args is the main function can be used
        // to take input from command line
        // when executing the file we can pass argument
        if (args.length<2){
            System.out.print("Please provide 2 argument");
            return;
        }

        System.out.println("Argument1:"+args[0]);
        System.out.println("Argument2:"+args[1]);


    }
}
