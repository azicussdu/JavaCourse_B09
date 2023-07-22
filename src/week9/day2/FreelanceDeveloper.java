package week9.day2;

import week9.day2.Developer;

public class FreelanceDeveloper extends Developer{
    private int monthWorkHours;

    public FreelanceDeveloper(String name, int salary, String progLanguage, int yearsOfExperience, int monthWorkHours) {
        super(name, salary, progLanguage, yearsOfExperience);
        this.monthWorkHours = monthWorkHours;
    }

    @Override
    public int calculateMonthSalary(){
        if(monthWorkHours > 200)
            return super.calculateMonthSalary() + 5000;
        else
            return super.calculateMonthSalary();
    }

    @Override
    public void showQualifications(){
        super.showQualifications();
        System.out.println("- good experience in solving problems");
        System.out.println("- good searching experience");
    }
}
