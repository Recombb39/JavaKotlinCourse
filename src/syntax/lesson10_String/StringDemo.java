package syntax.lesson10_String;

public class StringDemo {
    public static void main(String[] arg) {
        String strName = "Alex";
        String strLastname = new String("Bob");

        System.out.println(strName);
        System.out.println(strLastname);

        //эквивалентность
        String firstString = "Java";
        var secondString = "java";
        System.out.println("Is two strings equals: " + firstString.equals(secondString));
        System.out.println("Is two strings equals (ignoreCase): " + firstString.equalsIgnoreCase(secondString));

        //Длина строки
        System.out.println("The length of strName: " + strName.length());

        //Получение подстроки
        String greeting = "Hello, World!";
        String substring = greeting.substring(greeting.indexOf("W"), greeting.indexOf("!"));
        System.out.println(substring);

        //Проверка наличия подстроки
        String greetingWithUpperCase = greeting.toUpperCase();
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println("The string contains 'World': " + greetingWithLowerCase.contains("world"));


        //удаление пробелов (trim)
        var login = "   java_proger ";
        String loginAfterTrim = login.trim();
        System.out.println(login);
        System.out.println("loginAfterTrim: " + loginAfterTrim);

        //replace() - замена каких либо символов
        var loginAfterReplace = login.trim().replace("_", ".");
        System.out.println("loginAfterReplace: " + loginAfterReplace);

        //StringBuilder используем в одном потоке
        StringBuilder sb = new StringBuilder("Hello,");
        sb.append(" Alex");
        sb.append(" Java!");
        System.out.println(sb);

        //StringBuffer используется для многопоточного программирования

    }
}
