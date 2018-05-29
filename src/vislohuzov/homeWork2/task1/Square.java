package vislohuzov;

/**
 * Created by Ivan
 * class square
 */
public class Square extends Figure {
    /**
     * square's side
     */
    private double side;

    public Square(double side) {
        this.side = side;
    }

    /**
     * find square's area
     */
    @Override
    public double findArea() {
        return side*side;
    }

    /**
     * find square's perimeter
     */
    @Override
    public double findPerimeter() {
        return side*4;
    }
}