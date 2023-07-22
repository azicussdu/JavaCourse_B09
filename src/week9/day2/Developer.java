package week9.day2;

public class Developer extends Worker{
    private String progLanguage;
    protected int yearsOfExperience;

    public Developer(String name, int salary, String progLanguage, int yearsOfExperience) {
        super(name, salary);
        this.progLanguage = progLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public int calculateMonthSalary(){
        return super.calculateMonthSalary() + yearsOfExperience * 1000;
    }

    @Override
    public void showQualifications(){
        super.showQualifications();
        System.out.println("- experience in programming languages");
        System.out.println("- experience in databases");
        System.out.println("- experience in web dev");
    }

}
