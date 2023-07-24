package week10.project;

public class Toy extends Good implements IDiscountable{
    private int fromYear;

    public Toy(double price, String name, int fromYear) {
        super(price, name);
        this.fromYear = fromYear;
    }

    @Override
    public void showDescription() {
        System.out.println("name: " + getName());
        System.out.println("price: " + getPrice());
        System.out.println("can play from " + fromYear + "+ year");
    }

    @Override
    public void showPriceOnDiscount() {
        if(getPrice() < 50)
            System.out.println("For " + getName() + " the price with discount is: " + getPrice() * 0.9 + "$");
        else
            System.out.println("For " + getName() + " the price with discount is: " + getPrice() * 0.85 + "$");
    }
}
