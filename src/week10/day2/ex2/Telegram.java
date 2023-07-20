package week10.day2.ex2;

public class Telegram extends App implements IMessenger{

    public Telegram(int sizeMb) {
        super("telegram", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("The app: " + getName() + " is launched");
        System.out.println("- you can find by login");
        System.out.println("- you can call");
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending from telegram...");
        System.out.println("to phone number: " + phoneNumber);
        System.out.println("message: " + message);
    }
}
