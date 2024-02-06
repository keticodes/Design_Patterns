package Week3TestAssignment;

import org.junit.*;
import static org.junit.Assert.*;

public class StringManipulatorKetiTest {
    private StringManipulatorKeti manipulator;

    @BeforeClass
    public static void setUpClass() {
        // Code to initialize resources shared among all test methods
    }

    @AfterClass
    public static void tearDownClass() {
        // Code to clean up resources shared among all test methods
    }

    @Before
    public void setUp() {
        manipulator = new StringManipulatorKeti();
        // Code to set up resources before each test method
    }

    @After
    public void tearDown() {
        manipulator = null;
        // Code to clean up resources after each test method
    }

    @Test
    public void testReverse() {
        assertEquals("edoc", manipulator.reverse("code"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("CODE", manipulator.capitalize("code"));
    }
}

