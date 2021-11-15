import java.util.Scanner;
import java.util.InputMismatchException;
public class Task1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            a = in.nextInt();
            System.out.print("Введите второе число: ");
            b = in.nextInt();
            System.out.print("Введите третье число: ");
            c = in.nextInt();
            System.out.print("Введите четвертое число: ");
            d = in.nextInt();
            in.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Error");
        }
        if ((a <= b) & (a <= d) & (a <= c)) {
            System.out.println("Наименьшее число:"+a);
        }
        else if ((b <= a) & (b <= c) & (b <= d)) {
            System.out.println("Наименьшее число:"+b);
        }
       else if ((c <= a) & (c <= b) & (c <= d)) {
            System.out.println("Наименьшее число:"+c);
        }
       else if ((d <= a) & (d <= b) & (d <= c)) {
            System.out.println("Наименьшее число:"+d);
        }
    }
}
