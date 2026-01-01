                                                                                                                                                                                                   package bai_3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4.0,5.0);
        Square square = new Square(6.0);

        circle.setColor("Black");
        rectangle.setColor("Blue");
        square.setColor("Green");

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Square color: " + square.getColor());
    }
}
