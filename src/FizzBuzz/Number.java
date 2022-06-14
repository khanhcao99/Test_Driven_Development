package FizzBuzz;

public class Number {
    public static String checkNumberDivisibleThree(int a) {
        if (a % 3 == 0) {
            return "Fizz";
        }
        return null;
    }

    public static String checkNumberDivisibleFive(int a) {
        if (a % 5 == 0) {
            return "Buzz";
        }
        return null;
    }

    public static String checkNumberDivisibleThreeAndFive(int a) {
        if (a % 3 == 0 & a % 5 == 0) {
            return "FizzBuzz";
        }
        return null;
    }

    public static String checkNumberContainThree( String a) {
              if (a.contains("three")) {
            return "Fizz";
        }
        return null;
    }

    public static String checkNumberContainFive( String a) {
              if (a.contains("five")) {
            return "Buzz";
        }
        return null;
    }
}
