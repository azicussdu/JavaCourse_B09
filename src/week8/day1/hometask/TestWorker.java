package week8.day1.hometask;

import java.util.ArrayList;
import java.util.Scanner;

public class TestWorker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Worker> list = new ArrayList<>();

        while(true){
            System.out.println("press 1 to show all workers");
            System.out.println("press 2 to show workers by department");
            System.out.println("press 3 to show workers by position");
            System.out.println("press 4 to add a new worker");
            System.out.println("press 5 to remove a worker by index");
            System.out.println("press 6 to exit the menu");

            System.out.print("choose a menu: ");
            int num = in.nextInt();

            if(num == 1){
                if(list.isEmpty())
                    System.out.println("There are no workers in the list");
                else{
                    for(int i=0; i<list.size(); i++){
                        System.out.println(list.get(i));
                    }
                }
            }
            else
                if(num == 2){
                    System.out.print("enter the department name: ");
                    String depName = in.next();
                    for(int i=0; i<list.size(); i++){
                        if(list.get(i).department.equals(depName))
                            System.out.println(list.get(i));
                    }
                }
                else
                    if(num == 3){
                        System.out.print("enter the position name: ");
                        String posName = in.next();
                        for(int i=0; i<list.size(); i++){
                            if(list.get(i).position.equals(posName))
                                System.out.println(list.get(i));
                        }
                    }
                    else
                        if(num == 4){
                            Worker w = new Worker();
                            System.out.print("enter name: ");
                            w.name = in.next();
                            System.out.print("enter department: ");
                            w.department = in.next();
                            System.out.print("enter position: ");
                            w.position = in.next();
                            System.out.print("enter salary: ");
                            w.salary = in.nextInt();

                            list.add(w);
                        }
                        else
                            if(num == 5){
                                for(int i=0; i<list.size(); i++) {
                                    System.out.println((i + 1) + ") " + list.get(i));
                                }

                                System.out.print("choose a worker by number: ");
                                int n = in.nextInt();

                                list.remove(n-1);
                                System.out.println("a worker has been removed");
                            }
                            else
                                if(num == 6){
                                    System.out.println("bye bye");
                                    break;
                                }
        }

    }
}
