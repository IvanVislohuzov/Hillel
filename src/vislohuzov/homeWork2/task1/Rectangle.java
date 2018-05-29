package vislohuzov;

/**
 * Created by Ivan
 * class rectangle
 */
public class Rectangle extends Figure {
    /**
     * rectangle's width
     */
    private double width;
    /**
     * rectangle's length
     */
    private double length;

    public Rectangle(double width,double length ){
        this.length=length;
        this.width=width;
    }

    /**
     * find rectangle's area
     */
    @Override
    public double findArea() {
        return width*length;
    }

    /**
     * find rectangle's perimeter
     */
    @Override
    public double findPerimeter() {
        return (width+length)*2;
    }
}
