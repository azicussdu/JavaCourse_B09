package week10.project;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Good> goods = new ArrayList<>();

        goods.add(new ElectronicGood(1500, "IPhone 14Pro", "IPhone"));
        goods.add(new ElectronicGood(2500, "Laptop TUF Gaming", "Asus"));
        goods.add(new Clothing(120, "Summer dress", Color.ORANGE));
        goods.add(new Clothing(80, "Workout shorts", Color.BROWN));
        goods.add(new Toy(60, "Cars collection", 6));
        goods.add(new Toy(30, "Doll", 3));

        System.out.println("-------- showing all goods that you can buy on credit ---------");

        for(Good g : goods){
            if(g instanceof ICreditable){
                ((ICreditable) g).showPriceOnCredit();
            }
        }

        System.out.println("-------- showing all goods that you can buy on discount ---------");

        for(Good g : goods){
            if(g instanceof IDiscountable){
                ((IDiscountable) g).showPriceOnDiscount();
            }
        }

    }
}
