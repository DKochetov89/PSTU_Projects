import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n" + "Введите количество чисел в последовательности");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int max = 0;
        System.out.println("Введите " + n + " чисел");
        for (int i = 0; i < n; i++) {
            int y = scan.nextInt();
            if (y > max) max = y;
        } 
        System.out.println("Максимальный элемент последовательности равен " + max);
        scan.close();
    }
}
