package week9.day4;

public class Test {
    public static void main(String[] args) {

        // polymorphism - many forms
        // an object - can have many forms

        // Rectangle - rectangle, shape (any rectangle IS-A shape)
        // Square - square, shape, rectangle (any square IS-A rectangle)

        Rectangle rect = new Rectangle(3, 5);
        Square sqr = new Square(5);
        Circle cir = new Circle(3);

//        Rectangle r = new Square(5); //square is-a rectangle
//        Shape sh1 = new Rectangle(3, 4); //rectangle IS-A shape
//        Shape sh2 = new Square(3); //square IS-A shape
//        Shape sh3 = new Circle(3); //circle IS-A shape

        showShapeInfo(cir); //circle - circle, shape
        showShapeInfo(rect); //rectangle - rectangle, shape
        showShapeInfo(sqr); //square - square, rectangle, shape
    }

    public static void showShapeInfo(Shape sh){
        System.out.println("area: " + sh.getArea());
        System.out.println("perimeter: " + sh.getPerimeter());
    }
}
