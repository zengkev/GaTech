package edu.gatech.seclass;

import java.util.*;
/**
 * public class MyString implements MyStringInterface {
 *     // Must provide:
 *     // - getString()
 *     // - setString(String string)
 *     // - countAlphabeticWords()
 *     // - encrypt(int arg1, int arg2)
 *     // - convertDigitsToNamesInSubstring(int firstPosition, int finalPosition)
 */
public class MyString implements MyStringInterface {
    private String str;

    // getString()
    @Override
    public String getString() {
        return //CENSORED
    }

    // setString(String string)
    @Override
    public void setString(String string) {
        if (//CENSORED 
        this.str = string;
    }

    // countAlphabeticWords()
    @Override
    public int countAlphabeticWords() {
        if (//CENSORED);
        }
        // Split by non-alphabetic characters into words
        // Produce array of words from the current string // return 4 for string "i#love 2 pr00gram."
        //CENSORED
        }
        return count;
    }

    //encrypt(int arg1, int arg2) resource: https://www.geeksforgeeks.org/implementation-affine-cipher/
    // E(x) = (ax + b) mod m
    // x = gcd(a,m) and CoPrime True
    private static int gcd(/CENSORED // a and b can't be negative
        }
    }
    private boolean isCoPrimeTo62(//CENSORED
    }

    // Encrypt using Affine Cipher
    @Override
    public String encrypt(int arg1, int arg2) {
        if (//CENSORED);
        }
        // validate arg1 + throw Exception
        if (//CENSORED );
        }
        // validate arg2 + throw Exception
        if (//CENSORED);
        }
        // @return String encrypted using Affine Cipher
        // 62-character alphabet and use in encrypt
        String //CENSORED
    }
    /**
     *      * Replace the individual digits in the current string, between firstPosition and finalPosition
     *      * (included), with the corresponding name (i.e., string representation) of those digits.
     *      * @throws NullPointerException        If the current string is null
     *      * @throws IllegalArgumentException    If "firstPosition" < 1 or "firstPosition" > "finalPosition" (and the string
     *      *                                     is not null)
     *      * @throws MyIndexOutOfBoundsException If "finalPosition" is out of bounds (i.e., greater than the length of the
     *      *                                     string), 1 <= "firstPosition" <= "finalPosition", and the string is not null
     */
    @Override
    public void convertDigitsToNamesInSubstring(int firstPosition, int finalPosition) {
        if //CENSORED);
        }

        // validate < 1 and > final + throw illegalArgumentException
        if (//CENSORED);
        }

        // Out of bound check
        if (//CENSORED);
        }

        // Replace the individual digits in the current string with words
        StringBuilder numberString = new StringBuilder();

        for (//CENSORED
            }
        }
        this.str = numberString.toString();
    }
}