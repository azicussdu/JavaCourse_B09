package week10.project;

import java.util.Scanner;

public class Clothing extends Good implements ICreditable, IDiscountable {
    private Color color;

    public Clothing(double price, String name, Color color) {
        super(price, name);
        this.color = color;
    }

    @Override
    public void showDescription() {
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice());
        System.out.println("color: " + color);
    }

    @Override
    public void showPriceOnCredit() {
        Scanner in = new Scanner(System.in);
        System.out.print("For " + getName() + " choose amount of month 3-6-9: ");
        int months = in.nextInt();

        double newPrice = getPrice();

        if(months == 6){
            newPrice = getPrice() + getPrice() * 0.3;
        }
        else if(months == 9){
            newPrice = getPrice() + getPrice() * 0.5;
        }

        System.out.println("For " + getName() + " each month you have to pay: " + newPrice/months + "$");
    }

    @Override
    public void showPriceOnDiscount() {
        if(getPrice() < 100)
            System.out.println("For " + getName() + " the price with discount is: " + getPrice() * 0.85 + "$");
        else
            System.out.println("For " + getName() + " the price with discount is: " + getPrice() * 0.8 + "$");
    }
}

enum Color {
    YELLOW, RED, BLACK,
    WHITE, GREEN, PINK,
    BROWN, ORANGE
}