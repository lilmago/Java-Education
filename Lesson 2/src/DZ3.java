import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        System.out.println("\t****Конвертацтя температуры по " +
                "цельсию в температуру по фаренгейту***");
        System.out.println("Введите температуру в Павлодаре: ");
        double pvl = new Scanner(System.in).nextDouble();
        int coof1 = 32;
        double coof2 = 1.8;
        System.out.println("  Сегодня в Павлодаре " + pvl +
                " градуса по цельсию это " + (pvl * coof2 + coof1) + " граудсов по форингейту.\n");



        System.out.println("\t\t\t****Вас приветсвует конвертатор валют RUB в $****");
        System.out.println("Введите сумму в RUB: ");
        double rubPrice = new Scanner(System.in).nextDouble();
        System.out.println("\t\t\t\t\t" + rubPrice + " RUB это " + (rubPrice) * (1 / 76.6) + " $.\n");
        System.out.println("\t\t\t\t\t" + rubPrice + " Тенеге это " + (rubPrice) * (1 / 5.5) + " РУБЛЕЙ.\n");
        System.out.println("\t\t\t\t\t" + rubPrice + " $ это " + (rubPrice) * (1 * 460) + " ТЕНГЕ.\n");
        System.out.println("\t\t ****Хамза жинкин леопард, если прочитал этот текст!****");
    }
}
