package week9.day2;

public class Worker {
    private String name;
    protected int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int calculateMonthSalary(){
        return salary;
    }

    public void showQualifications(){
        System.out.println("- be responsible");
        System.out.println("- be sociable");
    }

    public int getSalary() {
        return salary;
    }
}
