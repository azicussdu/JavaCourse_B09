package week9.day4;

public class Test3 {
    public static void main(String[] args) {

        Game game = new Game("Guess the shape 3+");

        game.addShape(new Rectangle(3, 5));
        game.addShape(new Square(5));
        game.addShape(new Circle(3));
        game.addShape(new Square(4));
        game.addShape(new Circle(5));
        game.addShape(new Rectangle(4, 6));

        game.play();

//        game.showAllShapes();
//        game.showSpecificShapes();

    }
}
