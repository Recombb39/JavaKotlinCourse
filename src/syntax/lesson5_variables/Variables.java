package syntax.lesson5_variables;

public class Variables {
    public static void main(String[] args) {
        // 0 0 1 0 0 1 0 0
        // byte -128..127
        //System.out.println(Integer.parseInt("11111111", 2));
        byte byteNumber = 127;
        System.out.println("The byte number: " + byteNumber);

        //short - (-32768..32767)
        short shortNumber= 500;
        System.out.println("The short number: " + shortNumber);

        //int  (-2 billion..2 billion)
        int intNumber = 500000000;
        System.out.println("The int number: " + intNumber);

        //long 8 bytes
        long longNumber = 999_999_999L;
        System.out.println("The long number: " + longNumber);

        //float 4 bytes
        float floatNumber = 3.14f;
        System.out.println("The float number: " + floatNumber);

        //double 8 bytes
        double doubleNumber = 3.1456789;
        System.out.println("The double number: " + doubleNumber);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        //System.out.println(Double.isNaN(0.0/0.0));

        char charSymbol = 'A';
        System.out.println("The char symbol: " + charSymbol);

        boolean isActive = true;
        boolean isDeactive = false;
        System.out.println("The isActivate = " + isActive);
        System.out.println("The isDeactive = " +  isDeactive);

        var variableNum = 10L;
        int firstNumber, secondNumber;
        firstNumber = 5;
        secondNumber = 10;
        System.out.println("The variableNum: " + variableNum);
        System.out.println("The firstNumber: " + firstNumber);
        System.out.println("The secondNumber: " + secondNumber);
    }
}
