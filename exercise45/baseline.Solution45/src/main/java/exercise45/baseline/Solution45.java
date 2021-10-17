package exercise45.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.*;
import java.util.Scanner;

public class Solution45 {

    /*
     * Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
     * Replace each occurrence with use. Write the modified file to a new file.
     *
     * Example Output
     * Given the input file of
     *
     * One should never utilize the word "utilize" in writing. Use "use" instead.
     * For example, "She uses an IDE to write her Java programs" instead of "She
     * utilizes an IDE to write her Java programs".
     *
     * The program should generate
     *
     * One should never use the word "use" in writing. Use "use" instead.
     * For example, "She uses an IDE to write her Java programs" instead of "She
     * uses an IDE to write her Java programs".
     *
     * Constraints
     * -Prompt for the name of the output file.
     * -Write the output to a new file.
     */

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution45 app = new Solution45();

        //set target word to be replaced ignoring case sensitivity with pattern modifier
        String target = "utilize";
        //set word to replace target
        String replacement = "use";

        //get output file name from user
        String fileName = app.scanInput();

        //create object for ReplaceWord class
        ReplaceWord rw = new ReplaceWord();
        
        //scan in input file content and then replace 'utilize' with 'use'
        //create a new string with replaced word
        //print new string to file using user fileName.
        String newTxt = rw.replaceWord(rw.scanInFile(), target, replacement);
        rw.printToFile(fileName, newTxt);

    }

    private String scanInput (){
        //scan in file name from user.
        System.out.print("Name of output file: ");
        return input.nextLine();
    }
}
