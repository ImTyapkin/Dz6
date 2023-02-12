import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! Вы находитесь в конвертере физических величин! " +
                "Если вы хотите расчитать массу, то введите цифру 1; если расстояние, то введите цифру 2");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Вы выбрали расчёт массы. " +
                    "К сожалению эти расчёты сейчас не производятся, но вы можете провести расчёты расстояния. Для этого потребуется перезапустить программу и ввести цифру 2");
        } else {
            if (a == 2) {
                System.out.println("Вы выбрали расчёт расстояния");
            } else {
                System.out.println("Вы можете ввести либо 1, либо 2");
            }
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int b = scanner.nextInt();
            if (b == 1) {
                System.out.println("Вы выбрали метры");
            } else {System.out.println("Мили, ярды и футы ещё не реализованы. Будут реализованы в следующем релизе.");
                }
            System.out.println("Введите количество метров для конвертирования (целое число)");
            int c = scanner.nextInt();
            double mil = c * 0.0006;
            double yard = c * 1.094;
            double fyt = c * 3.281;
            System.out.println("Результат:");
            System.out.println("Метры: " + c);
            System.out.println("Мили: " + mil);
            System.out.println("Ярды: " + yard);
            System.out.println("Футы: " + fyt);
            }
        }
    }
