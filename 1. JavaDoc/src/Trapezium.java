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

    @Override
    public double calculateArea() {
        // Implementation of trapezium area calculation
        // Your code for area calculation
        return 0.0;
    }

    @Override
    public double calculatePerimeter() {
        // Implementation of trapezium perimeter calculation
        // Your code for perimeter calculation
        return 0.0;
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