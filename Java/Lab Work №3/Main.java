import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        int [] mass = new int[n]; //инициализация массива заданного размера
        System.out.print ("Сгенерированный массив: ");
        for (int i = 0; i < n; i++) {
            mass[i] = (int) (Math.random()*(200+1)) - 100;
            System.out.print ("[" + mass[i] + "]" + " ");
        } //заполнение массива случайными числами от -100 до 100
        System.out.println();

        System.out.println('\n' + "1) Удалить элементы больше среднего арифметического элементов массива" + '\n');
        int sum = 0, sa, count_sa = 0;
        for (int i = 0; i < n; i++) {
            sum += mass[i];
        }
        sa = sum / n; //нашли среднее арифметическое
        System.out.println("Среднее арифметическое = " + sa + ", результат:");
        // Считаем количество удаляемых элементов
        for (int i = 0; i < n; i++)
            if (mass[i] > sa)
                count_sa += 1;

        // Создаем новый массив длина его меньше на количество удаляемых элементов
        int n_new = mass.length - count_sa;
        int [] mass_task_1 = new int[n_new];
        int q = 0;
        for (int j : mass) {
            if (j < sa) {
                mass_task_1[q] = j;
                q += 1;
            }
        }
        for (int i = 0; i < n_new; i++) {
            System.out.print("[" + mass_task_1[i] + "]" + " ");
        }

        System.out.println("\n" + "\n" + "2) Добавить k элементов в конец массива");
        System.out.println("Введите число элементов: ");
        int k = in.nextInt();
        // Создаем новый массив длина его больше на к элементов
        int n_2 = mass_task_1.length + k;
        int [] mass_task_2 = new int[n_2];

        System.arraycopy(mass_task_1, 0, mass_task_2, 0, n_new); //заполняем новый массив элементами старого
        for (int i = n_new; i < n_2; i++) {
            mass_task_2[i] = (int) (Math.random()*(200+1)) - 100;
        } //заполняем новыми сгенерированными элементами
        System.out.println("Новый массив: ");
        for (int i = 0; i < n_2; i++) {
            System.out.print("[" + mass_task_2[i] + "]" + " ");
        }

        System.out.println("\n" + "\n" + "3) Найти первый четный элемент массива");
        int first_odd = 0;
        for (int i = mass_task_2.length - 1; i >= 0; i--) {
            if (mass_task_2[i] % 2 == 0) {
                first_odd = mass_task_2[i];
            }
        } // находим с конца массива первый элемент
        System.out.println('\n' + "Первый четный элемент массива: " + first_odd);

        System.out.println('\n' + "4) Отсортировать массив по методу простого включения:"); //сортировка вставками
        for (int i = 1; i < mass_task_2.length; i++) {
            int value = mass_task_2[i]; // запоминаем значение элемента
            int index = i;     // и его индекс
            while ((index > 0) && (mass_task_2[index - 1] > value))
            {   // смещаем другие элементы к концу массива пока они меньше index
                mass_task_2[index] = mass_task_2[index - 1];
                index--;    // смещаем просмотр к началу массива
            }
            mass_task_2[index] = value; // рассматриваемый элемент помещаем на освободившееся место
        }
        for (Integer newMass : mass_task_2) {
            System.out.print("[" + newMass + "]" + " ");
        }
    }
}
