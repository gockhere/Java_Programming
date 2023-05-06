package day31_inheritance.shape_methodOverriding;

public class TestShape {

    public static void main(String[] args) {

        Square square= new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------------------");

        Circle circle = new Circle(3.0911);
        System.out.println(circle);

    }
}
