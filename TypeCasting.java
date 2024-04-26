public class TypeCasting {

    // instance variable needs object to access and it is not shared in multiple
    // object
    int instanceVariable = 10;
    // static variable doesnot need boject and can be accessed using class. it is
    // shared in multiple object

    public static void main(String[] args) {
        TypeCasting tyepObj = new TypeCasting();
        System.out.println(tyepObj.instanceVariable);

        int intVariableConvert = 10;
        double intVariableConvertToVariable = intVariableConvert;
        // Explicit casting
        double doubleVariableConvert = 100.29;
        int doubleVariableConvert = (int) doubleVariableConvert;

        System.out.println(doubleVariableConvert);
    }
}
