package syntax.lesson9_AND_OR;

public class Operators {
    public static void main(String[] args) {
        //        Работа с операторами
        int a = 10, b = 3;


        //        операции сравнения
        boolean isEqual =  a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;

        //        And(&&) OR(||)
        boolean aIsGreaterThatB = a > b; //true
        boolean aIsEqualOfB = a == b;    //false
        //Конъюнкция
        boolean logicalAND = aIsGreaterThatB && aIsEqualOfB;
        //Дизъюнкция
        boolean logicalOR = aIsGreaterThatB || aIsEqualOfB;

        System.out.println("The result of expression: 10 > 3 AND 10 == 3 is " + logicalAND);
        System.out.println("The result of expression: 10 > 3 OR 10 == 3 is " + logicalOR);
    }
}
