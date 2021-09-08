/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package QuickSort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void insertionTwoElement() {
        int[] arr = {1,0};
        assertArrayEquals(new int[]{0, 1},QuickSort.sort(arr));
    }
    @Test
    void insertionOneElement() {
        int[] arr = {0};
        assertArrayEquals(new int[]{0},QuickSort.sort(arr));
    }
    @Test
    void insertionDuplicateElement() {
        int[] arr = {2,1,1,3,3,2};
        assertArrayEquals(new int[]{1,1,2,2,3,3},QuickSort.sort(arr));
    }
    @Test
    void insertionIsEmpty() {
        int[] arr = {};
        assertArrayEquals(new int[]{},QuickSort.sort(arr));

    }
    @Test
    void insertionIsNegativeVal() {
        int[] arr = {-1,1,-2,2,3};
        assertArrayEquals(new int[]{-2, -1, 1, 2, 3},QuickSort.sort(arr));

    }
    @Test
    void insertionIsSorted() {
        int[] arr = {1,2,3};
        assertArrayEquals(new int[]{1,2,3},QuickSort.sort(arr));

    }
}