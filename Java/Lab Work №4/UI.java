import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner in;
    private Employee t;
    private ArrayList<Employee> SL = new ArrayList<Employee>();

    public UI() {
        in = new Scanner(System.in);
    }

    public int getInt(String s) {
        int number = 0;
        boolean ok = false;
        do {
            System.out.print(s + ": ");
            try {
                number = Integer.valueOf(in.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе числа!");
            }
        } while (!ok);
        return number;
    }

    public double getDouble(String s) {
        double number = 0;
        boolean ok = false;
        do {
            System.out.print(s + ": ");
            try {
                number = Double.valueOf(in.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе числа!");
            }
        } while (!ok);
        return number;
    }

    public int getInt() {
        return getInt("");
    }

    public double getDouble() {
        return getDouble("");
    }

    private String getLine(String s) {
        System.out.print(s + ": ");
        return in.nextLine();
    }

    public Employee set() {
        t = new Employee();
        while (!t.setName(getLine("Введите фамилию"))) ;
        while (!t.setSalary(getDouble("Введите зарплату"))) ;
        while (!t.setStage(getInt("Введите разряд"))) ;
        return t;
    }

    public void show(Employee x) {
        System.out.println(x.data());
    }
    public void show() {
        show(t);
    }

    public void main_menu() {
        int sel;
        do {
            System.out.println ("1. Добавить сотрудника в список");
            System.out.println ("2. Смотреть сотрудников в списке");
            System.out.println ("3. Смотреть сотрудников у которых имя начинается на L");
            System.out.println ("4. Добавить К сотрудников в начало списка");
            System.out.println ("0. выход из программы");
            sel = getInt();
            switch (sel) {
                case 1: SL.add(set()); break;
                case 2: for (Employee x:SL) show(x); System.out.println (""); break;
                case 3: for (Employee x:SL) if (x.name().charAt(0) == 'L') {
                    System.out.println(x.data() + "\n");
                } break;
                case 4: {
                    System.out.println ("Введите K - количество сотрудников для добавления");
                    int num = in.nextInt();
                    in = new Scanner(System.in); // новый сканер
                    for (int j = 0; j < num; j++) {
                        SL.add(j, set());
                    }
                } break;
            }
        }
        while (sel != 0);
        in.close();
    }
}
