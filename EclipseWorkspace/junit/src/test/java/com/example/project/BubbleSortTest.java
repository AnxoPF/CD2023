package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testArray() {
        BubbleSort ob = new BubbleSort();

        int[] arr1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected1 = { 11, 12, 22, 25, 34, 64, 90 };
        ob.bubbleSort(arr1);
        assertArrayEquals(expected1, arr1);
    }
    void testOrdenado() {
        BubbleSort ob = new BubbleSort();

        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] expected2 = { 1, 2, 3, 4, 5 };
        ob.bubbleSort(arr2);
        assertArrayEquals(expected2, arr2);
    }
    void testInverso() {
        BubbleSort ob = new BubbleSort();
        
        int[] arr3 = { 5, 4, 3, 2, 1 };
        int[] expected3 = { 1, 2, 3, 4, 5 };
        ob.bubbleSort(arr3);
        assertArrayEquals(expected3, arr3);
    }
}
