package com.sad;

public class NonlinearEquation {
    private double[] coefficients;

    public NonlinearEquation(double[] array) {
        this.coefficients = array;
    }

    public double bisectionMethod(double a, double b, double epsilon) {

        if (evaluatePolynomial(a) * evaluatePolynomial(b) >= 0) {
            System.err.println("Невозможно найти корень на данном интервале [a, b].");
            return Double.NaN;
        }

        double c = a;
        while ((b - a) >= epsilon) {
            c = (a + b) / 2;
            if (evaluatePolynomial(c) == 0.0) {
                break;
            }
            if (evaluatePolynomial(c) * evaluatePolynomial(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }

    public double evaluatePolynomial(double x) {
        double result = 0.0;
        for(int i = 0; i < coefficients.length; i++) {
            result+= coefficients[i] * Math.pow(x, i);
        }
        return result;
    }


}