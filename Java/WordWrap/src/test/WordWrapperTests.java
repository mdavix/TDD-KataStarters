package test;

import app.WordWrapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Before you start:
 *  The following is a TDD Kata exercise in coding, refactoring and test-first.
 *  Try not to read ahead.
 *  Read each rule on their own, implement the necessary tests, refactor then move onto the next rule.
 *  Focus on testing for correct inputs only.
 *
 * The Word Wrap Kata
 * 1. Create a WordWrapper class that has a single method named Wrap that takes two arguments, a string, and a column number.
 * 2. The function returns the string, but with line breaks inserted at the right place to make sure that no line is longer than the column number.
 * 3. Like a word processor, break the line by replacing the last space in a line with a newline.
 * 4. The solution can assume that no word is longer than the maximum number characters in a line.
 */

public class WordWrapperTests {

    @Test
    public void PleaseDeleteMe_LetMeGo(){
        WordWrapper wrapper = new WordWrapper();

        assertEquals(wrapper.Wrap("", 10), "");
    }
}
