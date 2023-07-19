package week10.day2.ex2;

public class Instagram extends App{

    public Instagram(int sizeMb) {
        super("instagram", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("The app: " + getName() + " is launched");
        System.out.println("- you can follow somebody");
        System.out.println("- you can post a picture");
    }
}
