import java.util.Scanner;
public class TaskDop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число месяца: ");
        int a = in.nextInt();
        if ((a == 12) | (a == 1) | (a == 2)) {
            System.out.println("Время года - зима");
        }
        else if ((a == 3) | (a == 4) | (a == 5)) {
            System.out.println("Время года - весна");
        }
        else if ((a == 6) | (a == 7) | (a == 8)) {
            System.out.println("Время года - лето");
        }
        else if ((a == 9) | (a == 10) | (a == 11)) {
            System.out.println("Время года - осень");
        }
        else if (a >12) {
            System.out.println("Такого времени месяца не существует");
        }
    }
}