package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCheckerTest {

    @Test
    void _base_cases_tests(){
        assertEquals("e", LetterChecker.compare("abcd", "abcde"));
        assertEquals("f", LetterChecker.compare("abcde", "abcfde"));
        assertEquals("a", LetterChecker.compare("a", "aa"));
        assertEquals("a", LetterChecker.compare("ae", "aea"));
    }

    @Test
    void _empty_input_tests(){
        assertEquals("", LetterChecker.compare("", ""));
    }

    @Test
    void _wrong_input_tests(){
        assertEquals("", LetterChecker.compare("a", ""));
    }
}
