/**
 * Class for representing a point in two-dimensional space.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Constructor for creating a Point object.
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to get the value of the x-coordinate.
     * @return the x-coordinate of the point
     */
    public double getX() {
        return x;
    }

    /**
     * Method to get the value of the y-coordinate.
     * @return the y-coordinate of the point
     */
    public double getY() {
        return y;
    }
}