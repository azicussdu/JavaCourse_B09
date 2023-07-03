package week7.day4.homework;

public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(2022);
        d1.printDate();
        System.out.println(d1.getSeason());

        Date d2 = new Date(2023, 11, 12);
        d2.printDate();
        System.out.println(d2.getSeason());
    }
}
