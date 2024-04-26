public class SwitchStatement {
    public static void main(String[] args) {
        char value = 'e';
        int a = 10;
        switch (value) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            case 'e':
            switch (a) {
                case 1:
                System.out.println("You have 1");
                    
                    break;
            
                default:
                System.out.println("You dont have one");
                    break;
            }
            break;

            default:
            System.out.println("Deafult");
                break;
        }
    }
}
