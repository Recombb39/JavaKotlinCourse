package syntax.lesson7_final;

public class Final {
    public static void main(String[] args) {
        int firstInt = 4, secondInt = 8;

        secondInt = 15;
        System.out.println("firstInt = " + firstInt + ", secondInt = " + secondInt);

        //Финализация значения, нельзя изменить присвоенное значение!
        final var nameOfBoss = "Aleksej";
        //nameOfBoss = "Aleksey"; - Эта строка вызовет ошибку!
        System.out.println(nameOfBoss);
    }
}
