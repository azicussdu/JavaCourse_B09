package week11.day1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter day: ");
        int day = in.nextInt();
        System.out.print("enter month: ");
        int month = in.nextInt();
        System.out.print("enter year: ");
        int year = in.nextInt();

        Date d = new Date();
        try {
            d.setDay(day);
            d.setMonth(month);
            d.setYear(year);
        }
        catch(InvalidDateException ex){
            System.out.println(ex.getMessage());
        }


    }
}
