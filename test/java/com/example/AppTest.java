import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class FactorialExampleTest {

    @Test
    @DisplayName("Factorial of 0 should be 1")
    void testFactorialZero() {
        assertEquals(1, App.calculateFactorial(0));
    }

    @Test
    @DisplayName("Factorial of 5 should be 120")
    void testFactorialPositive() {
        assertEquals(120, App.calculateFactorial(5));
    }

    @Test
    @DisplayName("Should throw exception for negative numbers")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateFactorial(-1);
        });
    }
}
