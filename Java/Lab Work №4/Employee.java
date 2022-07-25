public class Employee {
    protected String _name;
    protected double _salary;
    protected int _stage;

    protected boolean isCorrect(String s) {
        if (s.isEmpty()) return false;
        for (int i=0; i<s.length(); i++)
            if (!((s.charAt(i)>='A')&&(s.charAt(i)<='z'))) return false;
        return true;
    }
    public String name() {
        return _name;
    }
    public boolean setName(String n) {
        if (isCorrect(n)) {
            _name = n;
            return true;
        }
        else return false;
    }

    public double salary() {
        return _salary;
    }
    public boolean setSalary(double arg) {
        if (arg>0) {
            _salary = arg;
            return true;
        }
        else return false;
    }

    public int stage() {
        return _stage;
    }
    public boolean setStage(int arg) {
        if (arg>0) {
            _stage = arg;
            return true;
        }
        else return false;
    }

    public String data() {
        return "Фамилия - " + _name + "; " + "Зарплата - " +
                String.valueOf(_salary) + "; " + "Разряд - " + String.valueOf(_stage) + ";";
    }
}
