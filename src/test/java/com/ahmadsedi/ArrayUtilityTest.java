package com.ahmadsedi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 05/03/2025
 * Time: 20:02
 */

public class ArrayUtilityTest {
    @Test
    void sortByFrequencyAndDistinct_givenNotEmptyArray_returnOrderDistinct(){
        String[] array = {"Tehran", "Shiraz", "Iran", "Tehran", "Iran", "Iran", "Iran"};
        String[] result = ArrayUtility.sortByFrequencyAndDistinct(array);
        String[] expected = {"Shiraz", "Tehran", "Iran"};
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    void sortByFrequencyAndDistinct_givenEmptyArray_returnEmpty(){
        String[] array = {};
        String[] result = ArrayUtility.sortByFrequencyAndDistinct(array);
        String[] expected = {};
        Assertions.assertArrayEquals(expected, result);
    }
}
