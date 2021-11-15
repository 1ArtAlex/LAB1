import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите третье число: ");
        int c = in.nextInt();
        System.out.print("Введите четвертое число: ");
        int d = in.nextInt();
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