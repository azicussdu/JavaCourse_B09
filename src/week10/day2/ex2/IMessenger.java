package week10.day2.ex2;

public interface IMessenger {
    String version = "VER 1.3"; //by default public static final

    //by default public and abstract
    void sendMessage(String phoneNumber, String message);

    //Java version 8.0 and later -> we have default interface methods
    default void receiveMessage(){
        System.out.println("received a message");
    }
}
