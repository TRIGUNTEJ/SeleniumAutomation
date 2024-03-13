package org.example;
import static org.junit.Assert.*;

import Lab.ArrayOperations;
import org.junit.Test;

public class ArrayOperationsTest {

    @Test
    public void testRemoveDuplicatesEmptyArray() {
        int[] input = {};
        int[] result = ArrayOperations.removeDuplicates(input);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testRemoveDuplicatesArrayWithNoDuplicates() {
        int[] input = {1, 2, 3, 4};
        int[] result = ArrayOperations.removeDuplicates(input);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testRemoveDuplicatesArrayWithDuplicates() {
        int[] input = {1, 2, 2, 3, 4, 4};
        int[] result = ArrayOperations.removeDuplicates(input);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void testRemoveDuplicatesNullArray() {
        int[] input = null;
        int[] result = ArrayOperations.removeDuplicates(input);
        assertNull(result);
    }

    @Test
    public void testSumArrayEmptyArray() {
        int[] input = {};
        int result = ArrayOperations.sumArray(input);
        assertEquals(0, result);
    }

    @Test
    public void testSumArrayArrayWithPositiveIntegers() {
        int[] input = {1, 2, 3, 4};
        int result = ArrayOperations.sumArray(input);
        assertEquals(10, result);
    }

    @Test
    public void testSumArrayArrayWithNegativeIntegers() {
        int[] input = {-1, -2, -3, -4};
        int result = ArrayOperations.sumArray(input);
        assertEquals(-10, result);
    }

    @Test
    public void testSumArrayArrayWithMixedPositiveAndNegativeIntegers() {
        int[] input = {1, -2, 3, -4};
        int result = ArrayOperations.sumArray(input);
        assertEquals(-2, result);
    }

    @Test
    public void testSumArrayArrayWithZeros() {
        int[] input = {0, 0, 0};
        int result = ArrayOperations.sumArray(input);
        assertEquals(0, result);
    }

    @Test
    public void testSumArrayNullArray() {
        int[] input = null;
        int result = ArrayOperations.sumArray(input);
        assertEquals(0, result);
    }
}

