package week10.day2.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class IPhone {
    private int freeMemory; //in megabytes
    private ArrayList<App> apps = new ArrayList<>();
    public IPhone(int freeMemory) {
        this.freeMemory = freeMemory;
    }
    public void install(App app){
        if(app.getSizeMb() <= freeMemory){
            apps.add(app);
            System.out.println("The app: " + app.getName() + " INSTALLED");
            freeMemory = freeMemory - app.getSizeMb();
        }
        else {
            System.out.println("No enough memory for app: " + app.getName());
        }
    }
    public void uninstall(){
        for(App app : apps){
            System.out.println(app.getName());
        }

        Scanner in = new Scanner(System.in);
        System.out.print("type the name you want to delete: ");
        String nameToRemove = in.next();

        boolean removed = false;

        for(App app : apps){
            if(app.getName().equals(nameToRemove)){
                int appsSizeInMb = app.getSizeMb();
                boolean isRemoved = apps.remove(app);
                if(isRemoved){
                    freeMemory = freeMemory + appsSizeInMb;
                    System.out.println("The app is REMOVED");
                    removed = true;
                    break;
                }
            }
        }
        if(!removed)
            System.out.println("The app is not removed by some reason");

    }

    public void sendViaMessengers(String phoneNumber, String message){
        //I will go through all apps
        //If the app is a messenger -> then send message to phoneNumber

        for(App apl : apps){
            if(apl instanceof IMessenger){
                //if I am here then the app is an object of Whatsapp or Telegram or Wechat
                ((IMessenger)apl).sendMessage(phoneNumber, message);
            }
        }
    }
    public int getFreeMemory() {
        return freeMemory;
    }
}
