package exercise43.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.*;
import java.util.Scanner;

public class Solution43 {

    /*
     * Create a program that generates a website skeleton with the following specifications:
     *
     * Prompt for the name of the site.
     * Prompt for the author of the site.
     * Ask if the user wants a folder for JavaScript files.
     * Ask if the user wants a folder for CSS files.
     *
     * Generate an index.html file that contains the name of the site inside
     *      the <title> tag and the author in a <meta> tag.
     *
     * Example Output
     * Site name: awesomeco
     * Author: Max Power
     * Do you want a folder for JavaScript? y
     * Do you want a folder for CSS? y
     * Created ./website/awesomeco
     * Created ./website/awesomeco/index.html
     * Created ./website/awesomeco/js/
     * Created ./website/awesomeco/css/
     *
     * The user should then find these files and directories created in the working directory of your program.
     */

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution43 app = new Solution43();

        //prompt user "Site name:" and scan in input
        String siteName = app.scanInput("Site name: ");

        //prompt user "Author:" and scan in input
        String author = app.scanInput("Author: ");

        //prompt user "Do you want a folder for JavaScript?" and scan in input
        boolean jsAnswer = app.checkYesOrNo(app.scanInput("Do you want a folder for JavaScript? "));

        //prompt user "Do you want a folder for CSS?" and scan in input
        boolean cssAnswer = app.checkYesOrNo(app.scanInput("Do you want a folder for CSS? "));

        //create object to createStuff for directory, html file, and folders.
        CreateStuff html = new CreateStuff();

        //generate directory, html file, and folders if needed.
    }

    private String scanInput (String prompt){
        //print prompt and scan in user input
        System.out.print(prompt);
        return input.nextLine();
    }

    public boolean checkYesOrNo (String userAnswer){
        //while answer is not y, n, yes, or no
        //prompt user "Please answer 'Y' or 'N'"
        //scan input and check again
        //return yesOrNo

    }
}
