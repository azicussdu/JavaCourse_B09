package week8.day3;

/*
ACCESS MODIFIERS:
    public - it can be used from any place inside the project
    private - it can be used from the same class ONLY!!!
    protected - it can be used from the same package OR from subclasses
    default(package-private) - can be accessed(used) only from the same package

    * for classes we can use only public OR default
 */
public class TestFromDay3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8, 5);
        r1.length = 12;
        r1.width = 10;

        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}
