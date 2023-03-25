import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
//        int abricos = 10;
//        int cocos = 20;
//        int appleAnanas = 30;
//        int persicMango = 40;
//        int maracuyaSliva = 50;
//
//        String name = "Timur";
//
//        char first = 'b';
//        char last = 'a';
//
//        int Integer = 10;
//
//        double remainder = 17.7;
//
//        System.out.println(abricos);
//        System.out.println(cocos);
//        System.out.println(appleAnanas);
//        System.out.println(persicMango);
//        System.out.println(maracuyaSliva);
//        System.out.println(name);
//        System.out.println(first);
//        System.out.println(last);
//        System.out.println(Integer);
//        System.out.println(remainder);

        System.out.println("Приветсвую вас в моем калькуляторе!\n ");
        System.out.println("Введите первое число для умножения, cложения," +
                "вычетания и разности частных двух чисел:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число для умножения, сложения, вычетания и" +
                "вычесления и разности частных двух чисел:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычетание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Разность и частное двух чисел: " + a + " / " + b + " = " + (a / b));
    }
}
