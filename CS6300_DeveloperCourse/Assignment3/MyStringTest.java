package edu.gatech.seclass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Junit test class created for use in Georgia Tech CS6300.
 * <p>
 * This class is provided to interpret your grades via junit tests
 * and as a reminder, should NOT be posted in any public repositories,
 * even after the class has ended.
 */

@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class MyStringTest {

    private MyStringInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new MyString();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    // Description: First count number example in the interface documentation
    public void testCountAlphabeticWords1() {
        myString.setString("My numbers are 11, 96, and thirteen");
        assertEquals(5, myString.countAlphabeticWords());
    }

    @Test
    // Description: Second count string with only number and punctuation
    public void //CENSORED

    @Test
    // Description: Third count string with number and punctuation
    public void //CENSORED

    @Test
    // Description: Fourth count Test Null
    public void //CENSORED
    @Test
    // Description: First SetString test Exception easterEgg
    public void testSetString1() {
        //CENSORED
    }

    @Test
    // Description: Sample encryption 1
    public void testEncrypt1() {
       //CENSORED
    }

    @Test
    // Description: Sample encryption 2 Null Exception
    public void testEncrypt2() {
        //CENSORED
    }

    @Test
    // Description: Sample encryption 3 CoPrime Exception
    public void testEncrypt3() {
        //CENSORED
    }

    @Test
    // Description: Sample encryption 4 between integer >= 1 and < 62
    public void testEncrypt4() {
        // Remove for academic integrity
    }

    @Test
    // Description: Sample encryption 5 With just Symbols and Number
    public void testEncrypt5() {
        // Remove for academic integrity

    @Test
    // Description: Sample encryption 6 Test Wrap around
    public void testEncrypt6() {
        // Remove for academic integrity
    }

    @Test
    // Description: First convert digits example in the interface documentation
    public void testConvertDigitsToNamesInSubstring1() {
       // Remove for academic integrity
    }


    @Test
    // Description: Second convert Test for Null
    public void testConvertDigitsToNamesInSubstring2() {
        // Remove for academic integrity

    @Test
    // Description: Third Convert validate < 1 and > final + throw illegalArgumentException
    public void testConvertDigitsToNamesInSubstring3() {
       // Remove for academic integrity
    @Test
    // Description: Fourth Convert Out of bound check
    public void testConvertDigitsToNamesInSubstring4() {
      // Remove for academic integrity

    @Test
    // Description: Fifth Convert Test whatever I am done
    public void testConvertDigitsToNamesInSubstring5() {
       // Remove for academic integrity
