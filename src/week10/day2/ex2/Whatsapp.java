package week10.day2.ex2;

public class Whatsapp extends App implements IMessenger{

    public Whatsapp(int sizeMb) {
        super("whatsapp", sizeMb);
    }

    @Override
    public void launch() {
        System.out.println("The app: " + getName() + " is launched");
        System.out.println("- you can text to your contact");
        System.out.println("- you can text to some groups");
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("Sending from whatsapp...");
        System.out.println("to phone number: " + phoneNumber);
        System.out.println("message: " + message);
    }

    @Override
    public void receiveMessage() {
        System.out.println("received a message to whatsapp");
    }
}
