package Next_Day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getNextDay() {
        int day = 2;
        int month = 9;
        int year = 1999;
        String expected = "03/09/1999";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void getLastDay() {
        int day = 31;
        int month = 12;
        int year = 2022;
        String expected = "01/01/2023";
        String result = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(expected,result);
    }
}