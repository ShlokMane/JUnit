import org.example.*;  // Import the package containing the StringHelper class
import org.junit.jupiter.api.*;  // Import JUnit 5 annotations
import static org.junit.jupiter.api.Assertions.*;  // Import assertion methods

/**
 * What I have learned:
 * - The @Test annotation is used to define a test case in JUnit 5.
 * - A test method must have `public void` as its access modifier and return type.
 * - The method name should follow the convention: `test<FunctionName>_<ConditionItTests>()`
 * - In older JUnit versions, test method names had to start with "test" as @Test annotation was not available.
 * - The assertEquals(expected, actual) method helps in debugging failures by displaying
 *   the expected and actual values.
 * - assertTrue() and assertFalse() are used for boolean condition checks.
 * - Writing comprehensive test cases ensures better code reliability and correctness.
 */

public class StringHelperTest {

    // Creating an instance of StringHelper to be used in test cases
    StringHelper helper = new StringHelper();

    /**
     * JUnit 5 @Test annotation marks this method as a test case.
     * This test verifies the function truncateAInFirst2Positions() when 'A' appears in the first two positions.
     * Expected Output: "AACD" → "CD"
     */
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    /**
     * This test case verifies the function when 'A' appears only in the first position.
     * Expected Output: "ACD" → "CD"
     */
    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    /**
     * This test case verifies that when there is no 'A' in the input string,
     * the function should return the original string unchanged.
     * Expected Output: "CDEF" → "CDEF"
     */
    @Test
    public void testTruncateAInFirst2Positions_NoAinString() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    /**
     * This test case verifies that when 'A' appears in the string but NOT in the first two positions,
     * the function should return the string unchanged.
     * Expected Output: "CDAA" → "CDAA"
     */
    @Test
    public void testTruncateAInFirst2Positions_ANotInFirst2Position() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    /**
     * This test verifies that areFirstAndLastTwoCharactersTheSame() returns false
     * when the first two and last two characters of the string do not match.
     * Expected Output: "ABCD" → false
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    /**
     * This test verifies that areFirstAndLastTwoCharactersTheSame() returns true
     * when the first two and last two characters are identical.
     * Expected Output: "ABAB" → true
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    /**
     * This test verifies that a string of exactly two characters
     * is considered valid if the first two characters match the last two (since they're the same).
     * Expected Output: "AB" → true
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Length2String() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    /**
     * This test verifies that a string of length 1 is always considered invalid
     * since there are no "first two" and "last two" characters.
     * Expected Output: "A" → false
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Length1String() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}
