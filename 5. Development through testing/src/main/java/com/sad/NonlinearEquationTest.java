package com.sad;
import static org.junit.Assert.*;
import org.junit.Test;

public class NonlinearEquationTest {

    @Test
    public void testBisectionMethod1() {
        // Тестирование метода бисекции для уравнения x^3 - 3x^2 + 3 = 0 на отрезке [a, b]
        double a = -1.0;
        double b = 2.0;
        double epsilon = 1e-8;
        double[] temp_coefficients = {1, 2};
        NonlinearEquation equation = new NonlinearEquation( temp_coefficients);
        double root = equation.bisectionMethod(a, b, epsilon);
        assertEquals(-0.5, root, epsilon);
    }

    @Test
    public void testBisectionMethod2() {
        double[] temp_coefficients = {-4, 3, 1}; // roots - 1 and -4
        double a = -2.0;
        double b = 3.0;
        double epsilon = 1e-8;
        NonlinearEquation equation = new NonlinearEquation(temp_coefficients);
        double root = equation.bisectionMethod(a, b, epsilon);
        assertEquals(1, root, epsilon);
    }

    @Test
    public void testBisectionMethod3() {
        double[] temp_coefficients = {-4, 3, 1}; // roots - 1 and -4
        double a = -6.0;
        double b = 0.0;
        double epsilon = 1e-8;
        NonlinearEquation equation = new NonlinearEquation(temp_coefficients);
        double root = equation.bisectionMethod(a, b, epsilon);
        assertEquals(-4, root, epsilon);
    }

    @Test
    public void testBisectionMethod4() {
        double[] temp_coefficients = {-1, 0, 0, 1}; // x^3 - 1 => roots - 1;
        double a = -5.0;
        double b = 5.0;
        double epsilon = 1e-8;
        NonlinearEquation equation = new NonlinearEquation(temp_coefficients);
        double root = equation.bisectionMethod(a, b, epsilon);
        assertEquals(1, root, epsilon);
    }



    @Test
    public void testBisectionMethod5() {
        double[] temp_coefficients = {-4, 1}; // x - 4 => root = 4
        double a = -5.0;
        double b = 5.0;
        double epsilon = 1e-8;
        NonlinearEquation equation = new NonlinearEquation(temp_coefficients);
        double root = equation.bisectionMethod(a, b, epsilon);
        assertEquals(4, root, epsilon);
    }


    @Test
    public void testBisectionMethod6() {
        double [] temp_coefficients = {0, 1};
        double a = 4.5;
        double b = 3.0;
        double epsilon = 1e-8;
        NonlinearEquation equation = new NonlinearEquation(temp_coefficients);
        equation.bisectionMethod(a, b, epsilon);
    }

}