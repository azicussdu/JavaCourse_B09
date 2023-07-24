package week10.project;

public abstract class Good {
    private double price;
    private String name;

    public Good(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public abstract void showDescription();

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
