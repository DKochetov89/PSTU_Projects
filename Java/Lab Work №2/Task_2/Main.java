import java.util.Scanner;

public class Main {
    
    public static int getInt(String s) {
        int number = 0;
        boolean ok = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(s + ": ");
            try {
                number = Integer.parseInt(in.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе числа");
            }
        } while (!ok);
        return number;
    }

    public static void main(String[] args) {
        int y=-1,max=0;
        System.out.println("Нахождение максимального элемента последовательности чисел");
        while (y != 0) {
            y = getInt("Введите число");
            if (y > max)
                max = y;
        }
        System.out.println("Максимальный элемент последовательности равен " + max);
    }
}
