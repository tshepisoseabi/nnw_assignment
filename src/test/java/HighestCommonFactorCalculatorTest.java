import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HighestCommonFactorCalculatorTest {

    @Test
    public void testHighestCommonFactor_PositiveNumbers() {
        int[] numbers = {20, 0, 5, 78, 60, 71};
        assertEquals(1, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_NegativeNumbers() {
        int[] numbers = {-20, -5, -10};
        assertEquals(5, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_MixedNumbers() {
        int[] numbers = {-20, 10, 5, -25};
        assertEquals(5, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_WithZero() {
        int[] numbers = {0, 10, 5, 25};
        assertEquals(5, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_EmptyArray() {
        int[] numbers = {};
        assertEquals(0, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_SingleElementArray() {
        int[] numbers = {7};
        assertEquals(7, Main.highestCommonFactor(numbers));
    }

    @Test
    public void testHighestCommonFactor_LargeNumbers() {
        int[] numbers = {1000000, 1000000000};
        assertEquals(1000000, Main.highestCommonFactor(numbers));
    }
}
