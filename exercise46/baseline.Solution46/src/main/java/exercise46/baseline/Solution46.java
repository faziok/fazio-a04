package exercise46.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Solution46 {

    /*
     * Create a program that reads in a file named `exercise46_input.txt`
     * and counts the frequency of words in the file. Then construct a histogram displaying the words
     * and the frequency, and display the histogram to the screen.
     *
     * Example Output
     * Given the text file `exercise46_input.txt` with this content
     *
     * badger badger badger
     * badger mushroom
     * mushroom snake badger badger
     * badger
     *
     * the program would produce the following output:
     *
     * badger:   *******
     * mushroom: **
     * snake:    *
     *
     * Constraint
     * -Ensure that the most used word is at the top of the report and the least used words are at the bottom.
     */

    public static void main(String[] args) throws IOException {
        Solution46 app = new Solution46();

        //scan in file to string
        String fileText = app.scanInFile();

        //get Map of the words and their count
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        //get a sorted Map of the words from the highest count to least
        Map<String, Integer> sortedWordCountMap = new LinkedHashMap<>());

        //print histogram of the sorted Map.

    }

    public String scanInFile () throws IOException {
        //create scanner for file
        Scanner sc = new Scanner(new File("data/exercise46_input.txt"));

        //create string to read in each line and string builder to put them together

        //while file has next word
        //scan line
        //append line to string builder

        //return string builder text as a string (trim to remove extra whitespace)
    }
}
