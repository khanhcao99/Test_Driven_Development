package Classify_Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Triangle")
     public void testTriangle() {
    double a = 3;
    double b = 4;
    double c = 5;

    boolean expected = true;
    boolean result = TriangleClassifier.testTriangle(a, b, c);
    assertEquals(expected, result);
    }

    @Test
    @DisplayName("Equilateral Triangle")
     public void testEquilateralTriangle() {
    double a = 3;
    double b = 3;
    double c = 3;

    boolean expected = true;
    boolean result = TriangleClassifier.testTriangle(a, b, c);
    assertEquals(expected, result);
    }


    @Test
    @DisplayName("Isosceles Triangle")
     public void testIsoscelesTriangle() {
    double a = 3;
    double b = 3;
    double c = 4;

    boolean expected = true;
    boolean result = TriangleClassifier.testTriangle(a, b, c);
    assertEquals(expected, result);
    }


}