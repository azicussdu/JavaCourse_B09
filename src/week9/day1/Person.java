package week9.day1;

public class Person {
    public String name;
    public int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else
            this.age = 1;
    }

    public String toString(){
        return "name: " + name + " | age: " + age;
    }
}
