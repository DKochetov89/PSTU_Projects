import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n" + "Введите значение x: ");
        double x = input.nextDouble();
        System.out.print("Введите значение y: ");
        double y = input.nextDouble();
        
        if (( y >= 0) && (y <= (2 - x)) && (y <= (x + 2))) {
            System.out.print("Точка попадает в заданную область");
        }
        else {
            System.out.print("Точка не попадает в заданную область");
        }
        input.close();
    }
}
