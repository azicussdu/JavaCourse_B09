package week8.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        FbAccount fa1 = new FbAccount("alex", "Qwerty111", true, 3);
        FbAccount fa2 = new FbAccount("jane", "Qwerty222", true, 2);
        FbAccount fa3 = new FbAccount("mike", "Qwerty333", false, 0);
        ArrayList<FbAccount> list = new ArrayList<FbAccount>(List.of(fa1, fa2, fa3));

        Scanner in = new Scanner(System.in);

        System.out.print("enter login: ");
        String login = in.next();
        System.out.print("enter password: ");
        String password = in.next();

        int activeUserIndex = -1; //here we will save the index of authenticated account
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getLogin().equals(login) && list.get(i).getPassword().equals(password)){
                activeUserIndex = i;
                break;
            }
        }

        if(activeUserIndex == -1){
            System.out.println("you entered wrong login or password");
        }
        else{
            System.out.println("you are authenticated successfully");
            while(true){
                System.out.println("press 1 to see your profile info");
                System.out.println("press 2 to change kids amount");
                System.out.println("press 3 to change password");
                System.out.println("press 4 to exit the web site");

                int num = in.nextInt();

                if(num == 1){
                    System.out.println(list.get(activeUserIndex));
                }
                else
                    if(num == 2){
                        System.out.print("enter how many kids you have now: ");
                        int newKidsAmount = in.nextInt();
                        list.get(activeUserIndex).setKidsAmount(newKidsAmount);
                    }
                    else
                        if(num == 3){
                            System.out.print("enter your old password: ");
                            String oldPass = in.next();
                            System.out.print("enter your new password: ");
                            String newPass = in.next();

                            boolean result = list.get(activeUserIndex).changePassword(oldPass, newPass);
                            if(result)
                                System.out.println("you password is changed to " + newPass);
                            else
                                System.out.println("you password couldn't be changed due to some reasons");
                        }
                        else
                            if(num == 4){
                                System.out.println("bye bye " + list.get(activeUserIndex).getLogin());
                                break;
                            }
            }
        }

    }
}
