import java.util.Comparator;

/**
 * Abstract base class for a geometric figure.
 */
public abstract class Figure implements Comparable<Figure> {
    /**
     * Method to calculate the area of the figure.
     * @return the area of the figure
     */
    public abstract double calculateArea();

    /**
     * Method to calculate the perimeter of the figure.
     * @return the perimeter of the figure
     */
    public abstract double calculatePerimeter();

    /**
     * Comparison of figures based on their area.
     * @param other the other figure to compare
     * @return a negative integer if this figure is less than other, a positive integer if greater, or zero if equal
     */
    @Override
    public int compareTo(Figure other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    /**
     * Comparator for comparing figures based on their perimeter.
     */
    public static Comparator<Figure> PerimeterComparator = new Comparator<Figure>() {
        @Override
        public int compare(Figure f1, Figure f2) {
            return Double.compare(f1.calculatePerimeter(), f2.calculatePerimeter());
        }
    };
}