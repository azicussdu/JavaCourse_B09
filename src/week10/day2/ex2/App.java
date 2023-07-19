package week10.day2.ex2;

public abstract class App {
    private String name;
    private int sizeMb;

    public App(String name, int sizeMb) {
        this.name = name;
        this.sizeMb = sizeMb;
    }

    public abstract void launch();

    public void close(){
        System.out.println("The app: " + name + " is closed.");
    }

    public String getName() {
        return name;
    }

    public int getSizeMb() {
        return sizeMb;
    }
}
