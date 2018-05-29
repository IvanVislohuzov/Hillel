package vislohuzov;

/**
 * Created by Ivan on 28.05.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        Rectangle rectangle=new Rectangle(2,4);
        Square square=new Square(3);
        System.out.println("Circle");
        System.out.println("S="+circle.findArea());
        System.out.println("P="+circle.findPerimeter());
        System.out.println();
        System.out.println("Rectangle");
        System.out.println("S="+rectangle.findArea());
        System.out.println("P="+rectangle.findPerimeter());
        System.out.println();
        System.out.println("Square");
        System.out.println("S="+square.findArea());
        System.out.println("P="+square.findPerimeter());
    }
}
