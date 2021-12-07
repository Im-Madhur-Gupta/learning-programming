package CalculatorDriver;
import CalculatorImplementation.Calculator;

public class Driver {
    public static void main(String[] args) {
        Calculator calculatorObj = new Calculator();
        System.out.println(calculatorObj.addition(3.0,7.0));
        System.out.println(calculatorObj.substarction(3.0,7.0));
        System.out.println(calculatorObj.multiplication(3.0,7.0));
        System.out.println(calculatorObj.division(14.0,7.0));
        System.out.println(calculatorObj.squareRoot(9.0));
        System.out.println(calculatorObj.remainder(15.0,7.0));
    }
}
