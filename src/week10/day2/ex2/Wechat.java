package week10.day2.ex2;

public class Wechat extends App implements IMessenger{
    public Wechat(int sizeMb) {
        super("wechat", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("The app: " + getName() + " is launched");
        System.out.println("- you can do viber call");
        System.out.println("- you can text with viber");
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending from wechat...");
        System.out.println("to phone number: " + phoneNumber);
        System.out.println("message: " + message);
    }
}
