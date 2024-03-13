package org.example;


import static org.junit.Assert.*;
import Lab.MathOperations;
import org.junit.Test;

public class MathOperationsTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, MathOperations.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, MathOperations.add(-2, -3));
    }

    @Test
    public void testAddOnePositiveOneNegative() {
        assertEquals(-1, MathOperations.add(2, -3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(5, MathOperations.add(5, 0));
        assertEquals(-2, MathOperations.add(0, -2));
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, MathOperations.multiply(2, 3));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, MathOperations.multiply(-2, -3));
    }

    @Test
    public void testMultiplyOnePositiveOneNegative() {
        assertEquals(-6, MathOperations.multiply(2, -3));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, MathOperations.multiply(5, 0));
        assertEquals(0, MathOperations.multiply(0, -2));
    }
}

