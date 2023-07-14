package week9.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Game { //Game object HAS-A list of shapes
    private String name;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void play(){
        Scanner in = new Scanner(System.in);
        int point = 0;

        for(Shape sh : shapes){
            sh.draw();

            System.out.println("1-Rectangle, 2-Square, 3-Circle");
            int num = in.nextInt();

            if(num == 1 && sh instanceof Rectangle && !(sh instanceof Square)){
                point++;
                System.out.println("goood...");
            }
            else
                if(num == 2 && sh instanceof Square){
                    point++;
                    System.out.println("right you areeeee...");
                }
                else
                    if(num == 3 && sh instanceof Circle) {
                        point++;
                        System.out.println("yeaaah...");
                    }
                    else
                        System.out.println("ooops, nope...");
        }

        System.out.println("Your point is: " + point + " out of " + shapes.size());
    }

    public void addShape(Shape sh){
        shapes.add(sh);
    }

    public void showAllShapes(){
        int num = 1;
        for(Shape sh : shapes){
            System.out.println(num + ". " + sh);
            num++; //num = num + 1;
        }
    }

    public void showSpecificShapes(){
        System.out.println("1. Rectangles only");
        System.out.println("2. Squares only");
        System.out.println("3. Circles only");

        Scanner in = new Scanner(System.in);
        System.out.print("choose a number: ");
        int num = in.nextInt();

        for(Shape sh : shapes){
            if(num == 1 && sh instanceof Rectangle && !(sh instanceof Square))
                System.out.println(sh);
            else
                if(num == 2 && sh instanceof Square)
                    System.out.println(sh);
                else
                    if(num == 3 && sh instanceof Circle)
                        System.out.println(sh);
        }
    }

    public void removeShape(){
        showAllShapes();
        Scanner in = new Scanner(System.in);
        System.out.print("choose a number to remove: ");
        int num = in.nextInt();
        shapes.remove(num-1);
    }

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
