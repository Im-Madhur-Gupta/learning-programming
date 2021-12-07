package CalculatorImplementation;

public class Calculator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double substarction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b){
        if (b == 0.0) {
            throw new IllegalArgumentException("You cant divide a number by 0");
        }
        return a / b;
    }

    public double squareRoot(double a){
        if (a < 0.0) {
            throw new IllegalArgumentException("Negative numbers don't have a real square root.");
        }
        return Math.sqrt(a);
    }

    public double remainder(double a, double b){
        if (b == 0.0) {
            throw new IllegalArgumentException("You cant divide a number by 0");
        }
        return a % b;
    }
}
