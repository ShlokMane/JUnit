import org.junit.jupiter.api.*;

/**
 * What I have learned:
 * - In JUnit 4, we had the following annotations:
 *   - @BeforeClass, @AfterClass (for setup and tear down at the class level).
 *   - @Before, @After (for setup and tear down before and after each test method).
 * - In JUnit 5, these were replaced with:
 *   - @BeforeAll and @AfterAll (class-level setup and tear down, must be static).
 *   - @BeforeEach and @AfterEach (runs before and after each test).
 * - This makes the annotations more readable and structured.
 * - @Test is used to define a test case.
 */

public class BeforeAfterTest {

    /**
     * Constructor:
     * - Since JUnit 5 creates a **new instance** of this test class for **each test case**,
     *   this constructor runs before every test method.
     * - This behavior is different from JUnit 4, where a single instance was shared.
     * - Useful for debugging when test instances are created.
     */
    public BeforeAfterTest() {
        System.out.println("Calling Constructor...");
    }

    /**
     * This method runs once before any test cases in this class.
     * It is marked as static because @BeforeAll requires static methods.
     * Typically used to set up expensive resources (e.g., database connections).
     */
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Starting...");
    }

    /**
     * This method runs before each test case.
     * It is useful for setting up test data or initializing objects before every test.
     */
    @BeforeEach
    public void setup() {
        System.out.println("Before Test");
    }

    /**
     * A test case that prints a message when executed.
     * This is where actual unit testing logic would go.
     */
    @Test
    public void test1() {
        System.out.println("Test 1 executed");
    }

    /**
     * Another test case that prints a different message when executed.
     * More test cases can be added here to cover different scenarios.
     */
    @Test
    public void test2() {
        System.out.println("Test 2 executed");
    }

    /**
     * This method runs after each test case.
     * It is used to clean up resources or reset test data after every test.
     */
    @AfterEach
    public void teardown() {
        System.out.println("After Test");
    }

    /**
     * This method runs once after all test cases in the class have executed.
     * It is marked as static because @AfterAll requires static methods.
     * Typically used to release resources like closing a database connection.
     */
    @AfterAll
    public static void afterClass() {
        System.out.println("Ending...");
    }
}
