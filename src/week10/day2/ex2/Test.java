package week10.day2.ex2;

public class Test {
    public static void main(String[] args) {

        IPhone iphone = new IPhone(1000);

        iphone.install(new Whatsapp(20));
        iphone.install(new Instagram(30));
        iphone.install(new Telegram(40));
        iphone.install(new Youtube(50));
        iphone.install(new Wechat(10));

        iphone.sendViaMessengers("+777722233344", "Hi, how are you?");

    }
}
