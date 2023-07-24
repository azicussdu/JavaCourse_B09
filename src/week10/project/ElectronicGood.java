package week10.project;

import java.util.Scanner;

public class ElectronicGood extends Good implements ICreditable {
    private String brand;
    public ElectronicGood(double price, String name, String brand) {
        super(price, name);
        this.brand = brand;
    }

    @Override
    public void showDescription() {
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice());
        System.out.println("brand: " + brand);
    }


    @Override
    public void showPriceOnCredit() {
        Scanner in = new Scanner(System.in);
        System.out.print("For " + getName() + " choose amount of month to pay(1-12): ");
        int months = in.nextInt();

        double newPrice = getPrice() + months * (getPrice() * 0.1);
        System.out.println("For " + getName() + " each month you have to pay: " + newPrice/months + "$");
    }
}
