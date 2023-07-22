package week10.day2.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<App> list = new ArrayList<>();
        list.add(new Whatsapp(20));
        list.add(new Instagram(30));
        list.add(new Telegram(40));
        list.add(new Youtube(50));
        list.add(new Wechat(10));

        for(App apl : list){
            if(apl instanceof IMessenger){
                ((IMessenger) apl).receiveMessage();
            }
        }

//        ArrayList<IMessenger> list2 = new ArrayList<>();
//        list2.add(new Whatsapp(20));
//        list2.add(new Telegram(20));





//        IPhone iphone = new IPhone(1000);
//
//        iphone.install(new Whatsapp(20));
//        iphone.install(new Instagram(30));
//        iphone.install(new Telegram(40));
//        iphone.install(new Youtube(50));
//        iphone.install(new Wechat(10));
//
//        iphone.sendViaMessengers("+777722233344", "Hi, how are you?");

    }
}
