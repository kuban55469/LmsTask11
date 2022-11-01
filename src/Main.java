import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Triangle деген класс тузунуз.

        Класстын 3 полеси болсун a, b, c.

        Класстын "area" деген методу болсун.

        "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)

        таянып консолго уч бурчтуктун аянтын чыгарсын. */

        Scanner sc = new Scanner(System.in);
        Triangle tg = new Triangle();
        System.out.print("Длина катета а: ");
        tg.a = sc.nextInt();
        System.out.print("Длина катета b: ");
        tg.b = sc.nextInt();
        System.out.print("Длина катета c: ");
        tg.c = sc.nextInt();
        System.out.println(tg.area());

    }
}