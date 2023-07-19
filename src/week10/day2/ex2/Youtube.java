package week10.day2.ex2;

public class Youtube extends App{

    public Youtube(int sizeMb) {
        super("youtube", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("The app: " + getName() + " is launched");
        System.out.println("- you can upload video");
        System.out.println("- you can open your channel");
    }
}
