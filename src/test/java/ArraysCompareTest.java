import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

/**
 * What I have learned:
 * - In JUnit 4, @Test had `expected` and `timeout` parameters, but in JUnit 5:
 *   - We use `assertThrows()` to check for expected exceptions instead of `@Test(expected = Exception.class)`.
 *   - We use `assertTimeout()` to set time constraints instead of `@Test(timeout = 100)`.
 * - `assertEquals()` checks object references for arrays, so we use `assertArrayEquals()` to compare actual values.
 * - `assertArrayEquals()` ensures the arrays have the same elements in the same order.
 */

public class ArraysCompareTest {

    /**
     * Test case to verify sorting of an integer array.
     * - The original array is unsorted.
     * - After sorting, it should match the expected sorted array.
     * - We use assertArrayEquals because assertEquals only checks reference equality,
     *   while assertArrayEquals compares the actual values of both arrays.
     */
    @Test
    public void testArraySort_randomArray() {
        int[] arr = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }

    /**
     * Test case to verify exception handling when sorting a null array.
     * - Instead of @Test(expected = NullPointerException.class), we use assertThrows.
     * - The test passes only if NullPointerException is thrown.
     */
    @Test
    public void testArraySort_NullArray() {
        int[] numbers = null;
        assertThrows(NullPointerException.class, () -> Arrays.sort(numbers));
    }

    /**
     * Performance test case to check sorting speed.
     * - Instead of @Test(timeout = 100), we use assertTimeout.
     * - The test must complete within 100 milliseconds, or it will fail.
     */
    @Test
    public void testArraySort_Performance() {
        int[] arr = {12, 3, 4, 1};

        assertTimeout(Duration.ofMillis(100), () -> {
            for (int i = 1; i < 1000000; i++) {
                arr[0] = i;
                Arrays.sort(arr);
            }
        });
    }
}
