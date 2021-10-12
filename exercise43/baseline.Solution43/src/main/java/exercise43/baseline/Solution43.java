package exercise43.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import javax.swing.text.html.CSS;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        boolean jsAnswer = app.checkYesOrNoAnswer("Do you want a folder for JavaScript? ");

        //prompt user "Do you want a folder for CSS?" and scan in input
        boolean cssAnswer = app.checkYesOrNoAnswer("Do you want a folder for CSS? ");

        //generate website directory and index.html file skeleton
        app.createHTMLFile(siteName, author);

        //generate folders for JS and/or CSS if they want
        app.createFolders(siteName, jsAnswer, cssAnswer);
    }

    private String scanInput (String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    private boolean checkYesOrNoAnswer (String prompt){
        //while answer is not y, n, yes, or no
        //prompt user "Please answer 'Y' or 'N'"
        //scan input
        System.out.print(prompt);
        String answer = input.nextLine();
        boolean yesOrNo = false;
        while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y")
                && !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("n")){
            answer = scanInput("Please answer 'Y' or 'N': ");
        }
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            yesOrNo = true;
        }
       return yesOrNo;
    }

    private void createFolders (String siteName, boolean js, boolean css) throws IOException {
        String created = "Created";

        if (js){
            Path pathJS = Paths.get(String.format("./data/%s/js", siteName));
            Files.createDirectories(pathJS);
            System.out.printf("%s %s%n", created, pathJS.subpath(0, 4));
        }
        if (css){
            Path pathCSS = Paths.get(String.format("./data/%s/css", siteName));
            Files.createDirectories(pathCSS);
            System.out.printf("%s %s%n", created, pathCSS.subpath(0, 4));
        }
    }

    private void createHTMLFile (String siteName, String author) throws IOException {
        Path sitePath = Paths.get(String.format("./data/%s", siteName));
        Files.createDirectories(sitePath);
        System.out.printf("%nCreated %s%n", sitePath.subpath(0, 3));

        try {
            File file = new File(String.format("./data/%s/index.html", siteName));
            String html = String.format("<!DOCTYPE html>%n<head>%n<title> %s </title>" +
                    "%n<meta name=\"author\" content=\"%s\">%n</head>%n" +
                    "<body><H1>HELLO, TO END OF THE WORLD!</H1></body>%n</html>", siteName, author );
            PrintWriter writer = new PrintWriter(file);
            writer.write(html);
            writer.close();
            System.out.printf("Created %s%n", file.getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
