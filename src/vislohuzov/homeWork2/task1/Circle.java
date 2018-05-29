package vislohuzov;

/**
 * Created by Ivan
 * class circle
 */
public class Circle extends Figure {

    /**
     * circle's radius
     */
    private double radius;

    /**
     * number Pi
     */
    private final double PI = 3.1415926536;

    public  Circle(double radius){
        this.radius=radius;
    }

    /**
     * find circle's area
     */
    @Override
    public double findArea() {
        return PI*radius*radius;
    }

    /**
     * find circle's perimeter
     */
    @Override
    public double findPerimeter() {
        return 2*PI*radius;
    }
}
