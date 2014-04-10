package test;

import app.LeapYearCalculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Before you start:
 *  The following is a TDD Kata exercise in coding, refactoring and test-first.
 *  Try not to read ahead.
 *  Read each rule on their own, implement the necessary tests, refactor then move onto the next rule.
 *  Focus on testing for correct inputs only.
 *
 * The Leap Year Kata
 * Write a function that returns true or false depending on whether its input integer is a leap year or not.
 *
 * 1. A leap year is defined as one that is divisible by 4
 * 2. A leap year is should not be divisible by 100
 * 2. A leap year can only be divisible by 100 if it is also divisible by 400
 *
 * For example, 2001 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000 is an atypical leap year.
 */

public class LeapYearCalculatorTests {

    @Test
    public void PleaseDeleteMe_LetMeGo(){
        LeapYearCalculator calc = new LeapYearCalculator();

        assertThat(calc.IsLeapYear(2000), is(true));
    }
}
