package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] test1 = {"red", "orange", "yellow", "green", "blue", "purple"};
        assertEquals(_01_LinearSearch.linearSearch(test1, "orange"), 1);
        
        String[] test2 = {"a", "b", "c", "d", "e", "f"};
        assertEquals(_01_LinearSearch.linearSearch(test2, "g"), -1);
        
        String[] test3 = {"one", "two", "three", "four", "five", "six"};
        assertEquals(_01_LinearSearch.linearSearch(test3, "six"), 5);
        
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(_02_BinarySearch.binarySearch(test1, 0, 6, 3), 2);
        
        int[] test2 = {8,9,10};
        assertEquals(_02_BinarySearch.binarySearch(test2, 0, 2, 9), 1);
        
        int[] test3 = {1,3,5,7,9};
        assertEquals(_02_BinarySearch.binarySearch(test3, 0, 4, 8), -1);
        
        
        
        
        
        
    }
}
