import java.util.Arrays;

/**
 * Class demonstrating the usage of the Trapezium class.
 */
public class Main {
    /**
     * Main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Creating a small array of objects
        Trapezium trapezium1 = new Trapezium(new Point(0, 0), new Point(2, 0), new Point(1, 1), new Point(3, 1), "black", "red");
        Trapezium trapezium2 = new Trapezium(new Point(1, 2), new Point(3, 2), new Point(2, 3), new Point(4, 3), "blue", "green");

        Trapezium[] trapeziums = {trapezium1, trapezium2};

        // Printing figures sorted by area
        Arrays.sort(trapeziums);
        System.out.println("Sorted by area:");
        for (Trapezium trapezium : trapeziums) {
            System.out.println(trapezium);
        }

        // Printing figures sorted by perimeter
        Arrays.sort(trapeziums, Figure.PerimeterComparator);
        System.out.println("\nSorted by perimeter:");
        for (Trapezium trapezium : trapeziums) {
            System.out.println(trapezium);
        }
    }
}