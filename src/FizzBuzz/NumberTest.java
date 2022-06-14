package FizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    @DisplayName("checkNumberDivisibleThree")
    void checkNumberDivisibleThree() {
        int a = 3;
        String expected = "Fizz";
        String result = Number.checkNumberDivisibleThree(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("checkNumberDivisibleFive")
    void checkNumberDivisibleFive() {
        int a = 5;
        String expected = "Buzz";
        String result = Number.checkNumberDivisibleFive(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("checkNumberDivisibleThreeAndFive")
    void checkNumberDivisibleThreeAndFive() {
        int a = 15;
        String expected = "FizzBuzz";
        String result = Number.checkNumberDivisibleThreeAndFive(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("checkNumberContainThree")
    void checkNumberContainThree() {
        String a = "three four";
        String expected = "Fizz";
        String result = Number.checkNumberContainThree(a);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("checkNumberContainFive")
    void checkNumberContainFive() {
        String a = "one five";
        String expected = "Buzz";
        String result = Number.checkNumberContainFive(a);
        assertEquals(expected, result);
    }
}