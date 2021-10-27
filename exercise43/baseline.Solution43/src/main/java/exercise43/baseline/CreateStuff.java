package exercise43.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateStuff {

    public void createWebsiteDirectory (String siteName) throws IOException {
        //set path for the directory to be created
        Path sitePath = Paths.get(String.format("./data/%s", siteName));

        //create directory
        Files.createDirectories(sitePath);

        //print the relative path to the console
        System.out.printf("%nCreated %s%n", sitePath.subpath(0, 3));
    }

    public void createHTMLFile(String siteName, String author) throws IOException {
        try {
            //create file at location with the siteName
            File file = new File(String.format("./data/%s/index.html", siteName));

            //set string for html file
            String html = String.format("<!DOCTYPE html>%n<head>%n<title> %s </title>" +
                    "%n<meta name=\"author\" content=\"%s\">%n</head>%n" +
                    "<body><H1>HELLO, TO END OF THE WORLD!</H1></body>%n</html>", siteName, author );

            //create the printwrite to wrtie to the html file
            PrintWriter writer = new PrintWriter(file);

            //write to the html file
            writer.write(html);

            //close writer
            writer.close();

            //print the relative path to the console
            System.out.printf("Created %s%n", file.getPath());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void createFolders (String siteName, boolean js, boolean css) throws IOException {
        String created = "Created";

        //if js answer is true create folder
        if (js){
            Path pathJS = Paths.get(String.format("./data/%s/js", siteName));
            Files.createDirectories(pathJS);
            System.out.printf("%s %s%n", created, pathJS.subpath(0, 4));
        }
        //if css answer is true create folder
        if (css){
            Path pathCSS = Paths.get(String.format("./data/%s/css", siteName));
            Files.createDirectories(pathCSS);
            System.out.printf("%s %s%n", created, pathCSS.subpath(0, 4));
        }
    }
}
