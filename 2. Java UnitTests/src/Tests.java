import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;
public class Tests {

    @Test
    public void calculatingPerimeter_test1() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(1 ,1);
        Point p4 = new Point(0, 2);
        String boardercolor = "green";
        String areacolor = "red";
        Trapezium trap = new Trapezium(p1, p2, p3, p4, boardercolor, areacolor);
        double estimated_result = 4 + Math.sqrt(2);
        assertEquals(trap.calculatePerimeter(), estimated_result, Math.pow(10, -5));
    }


    @Test
    public void calculatingPerimeter_test2() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(2 ,2);
        Point p4 = new Point(1, 3);
        String boardercolor = "green";
        String areacolor = "red";
        Trapezium trap = new Trapezium(p1, p2, p3, p4, boardercolor, areacolor);
        double estimated_result = 1 + 1 + 2 + Math.sqrt(2);
        assertEquals(trap.calculatePerimeter(), estimated_result, Math.pow(10, -9));
    }

    @Test
    public void calculateArea_test1() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(1 ,1);
        Point p4 = new Point(0, 2);
        String boardercolor = "green";
        String areacolor = "red";
        Trapezium trap = new Trapezium(p1, p2, p3, p4, boardercolor, areacolor);
        double estimated_result = 1.5;
        assertEquals(trap.calculateArea(), estimated_result, Math.pow(10, -9));
    }

    @Test
    public void point_X_getter() {
        Point p1 = new Point(0, 5);
        assertEquals(0, p1.getX(), Math.pow(10, -5));
    }

    @Test
    public void point_Y_getter() {
        Point p1 = new Point(0, 5);
        assertEquals(5, p1.getY(), Math.pow(10, -5));
    }

    @Test
    public void comparator_test() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Figure trapezium1 = new Trapezium(p1, p2, p3, p4, "black", "white");

        Point p5 = new Point(-1, -1);
        Point p6 = new Point(5, -1);
        Figure trapezium2 = new Trapezium(p5, p6, p3, p4, "black", "white");

        assertTrue(trapezium2.compareTo(trapezium1) > 0);
    }

    @Test
    public void testCalculateArea() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Trapezium trapezium = new Trapezium(p1, p2, p3, p4, "black", "white");
        double expectedArea = 9.0; // Assuming unit of measurement is square units
        assertEquals(expectedArea, trapezium.calculateArea(), 0.001); // Tolerance for floating point comparison
    }

    @Test
    public void testCalculatePerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Trapezium trapezium = new Trapezium(p1, p2, p3, p4, "black", "white");
        double expectedPerimeter = 6. + 2 * Math.sqrt(10); // Assuming unit of measurement is linear units
        assertEquals(expectedPerimeter, trapezium.calculatePerimeter(), 0.001); // Tolerance for floating point comparison
    }

    @Test
    public void testIterator() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 3);
        Trapezium trapezium = new Trapezium(p1, p2, p3, p4, "black", "white");
        Iterator<Object> iterator = trapezium.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(p1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(p2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(p3, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(p4, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("black", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("white", iterator.next());
        assertFalse(iterator.hasNext());
    }


}
