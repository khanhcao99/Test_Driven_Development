package Classify_Triangle;

public class TriangleClassifier {

    public static boolean testTriangle(double a, double b, double c) {
        if ((a + b + c) > 0) {
            return true;
        }
        return false;
    }

    public static boolean testEquilateralTriangle(double a, double b, double c) {
        if (a == b & a == c & b == c) {
            return true;
        }
        return false;
    }

    public static boolean testIsoscelesTriangle(double a, double b, double c) {
        if (a == b || a == c || b == c) {
            return true;
        }
        return false;
    }
}
