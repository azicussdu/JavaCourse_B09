package week9.day1;

public class Student extends Person{

    public String school;
    public int grade;

    public Student(String name, int age, String school, int grade){
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    public Student(String school, int grade){
        this.school = school;
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString(){
        return super.toString() + " | school: " + school + " | grade: " + grade;
    }
}
