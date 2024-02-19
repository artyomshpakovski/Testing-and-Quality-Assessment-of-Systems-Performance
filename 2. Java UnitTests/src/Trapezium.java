import java.util.Arrays;
import java.util.Iterator;

/**
 * Class for representing a trapezium.
 */
public class Trapezium extends Figure implements Iterable<Object> {
    private Point p1, p2, p3, p4;
    private String borderColor;
    private String fillColor;

    /**
     * Constructor for creating a Trapezium object.
     * @param p1 the first vertex of the trapezium
     * @param p2 the second vertex of the trapezium
     * @param p3 the third vertex of the trapezium
     * @param p4 the fourth vertex of the trapezium
     * @param borderColor the border color
     * @param fillColor the fill color
     */
    public Trapezium(Point p1, Point p2, Point p3, Point p4, String borderColor, String fillColor) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    private double getDistance(Point p1, Point p2) {
        return Math.sqrt( Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    private double calculateTriangleArea(Point p1, Point p2, Point p3) {

        double side1 = getDistance(p1, p2);
        double side2 = getDistance(p2, p3);
        double side3 = getDistance(p3, p1);
        double semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));

    }

    @Override
    public double calculateArea() {
        return calculateTriangleArea(p1, p2, p3) + calculateTriangleArea(p1, p4, p3);
    }

    @Override
    public double calculatePerimeter() {
        double result = 0.;
        result+=getDistance(p1, p2);
        result+=getDistance(p2, p3);
        result+=getDistance(p3, p4);
        result+=getDistance(p4, p1);
        return result;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", p4=" + p4 +
                ", borderColor='" + borderColor + '\'' +
                ", fillColor='" + fillColor + '\'' +
                '}';
    }

    @Override
    public Iterator<Object> iterator() {
        return Arrays.asList(p1, p2, p3, p4, borderColor, fillColor).iterator();
    }
}