package exercise43.baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateStuff {

    public void createHTMLFile(String siteName, String author) throws IOException {
        //set path for the directory to be created
        Path sitePath = Paths.get(String.format("./data/%s", siteName));

        //create directory
        Files.createDirectories(sitePath);

        //print the relative path to the console
        System.out.printf("%nCreated %s%n", sitePath.subpath(0, 3));

            //try
            //create file at location with the siteName
            //set string for html file
            //create the printwrite to wrtie to the html file

            //write to the html file

            //close writer

            //print the relative path to the console
    }

    public void createFolders (String siteName, boolean js, boolean css) throws IOException {
        String created = "Created";

        //if js answer is true create folder
    }
}
