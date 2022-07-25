import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите значение x: ");
        double x = input.nextDouble();

        if (x > 0) {
            double sin = Math.sin(Math.toRadians(x) * Math.toRadians(x) * Math.toRadians(x));
            double a = Math.pow (x, 2) + Math.pow (x, 3);
            double result = sin + Math.pow (x, 4) + Math.pow (a, 0.2);
            System.out.format("Результат = %.2f", result);
        } else if (x == 0)
            System.out.println("Результат = 0");
        else
            System.out.println("Введено отрицательное значение переменной");

        input.close();
    }
}
