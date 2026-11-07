package syntax.lesson8_operators;

public class Operators {
    public static void main(String[] args) {

//        Работа с операторами
        int a = 4, b = 8;

//        оператор присваивания
        b = a;

//        арифметические операторы
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

//        операции увеличения на 1
        a = a + 1;
        a++; //инкрементирование
        b--; //декрементирование
        a += 4;
        b -= 2;
        a *= 4;
        b /= 3;

//        операции сравнения
        boolean isEqual =  a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;

    }
}
