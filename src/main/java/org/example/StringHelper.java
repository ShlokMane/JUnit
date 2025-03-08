package org.example;

public class StringHelper {

    /**
     * Removes 'A' characters from the first two positions of the given string.
     * If the string length is 2 or less, it removes all occurrences of 'A'.
     *
     * @param str The input string.
     * @return The modified string with 'A' removed from the first two positions.
     */
    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2)
            return str.replaceAll("A", "");

        String first2Chars = str.substring(0, 2);
        String stringMinusFirst2Chars = str.substring(2);

        return first2Chars.replaceAll("A", "")
                + stringMinusFirst2Chars;
    }

    /**
     * Checks if the first two characters of the string are the same as the last two characters.
     * - If the string length is 1 or less, returns false.
     * - If the string length is exactly 2, returns true.
     * - Otherwise, compares the first two and last two characters.
     *
     * @param str The input string.
     * @return true if the first two characters match the last two, false otherwise.
     */
    public boolean areFirstAndLastTwoCharactersTheSame(String str) {

        if (str.length() <= 1)
            return false;
        if (str.length() == 2)
            return true;

        String first2Chars = str.substring(0, 2);

        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);
    }

}
