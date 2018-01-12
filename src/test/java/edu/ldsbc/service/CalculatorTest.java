package edu.ldsbc.service;

import static org.junit.Assert.*;

/**

 **/
public class CalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.add(1,1));
        assertEquals(0, calculator.add(1,-1));
    }
    @org.junit.Test
    public void subtract() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.subtract(2,1));
        assertEquals(0, calculator.subtract(1,1));
    }
    @org.junit.Test
    public void multiply() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(4, calculator.multiply(2,2));
        assertEquals(16, calculator.multiply(4,4));
    }
    @org.junit.Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.divide(4,2));
        assertEquals(3, calculator.divide(6,2));
    }

}