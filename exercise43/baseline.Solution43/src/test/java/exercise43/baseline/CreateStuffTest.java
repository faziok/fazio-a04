package exercise43.baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CreateStuffTest {
    CreateStuff cS = new CreateStuff();

    String siteName = "HelloWorld.com";
    String author = "Billy Bob";
    boolean jsAnswer = true;
    boolean cssAnswer = true;


    @Test
    void createWebsiteDirectory() throws IOException {
        cS.createWebsiteDirectory(siteName);

        //test for website directory and delete
        File file = new File (String.format("./data/%s", siteName));
        assertTrue(file.exists());
    }

    @Test
    void createHTMLFile() throws IOException {
        cS.createHTMLFile(siteName, author);
        
        //test for HTML and delete
        File fileHTML = new File (String.format("./data/%s/index.html", siteName));
        assertTrue(fileHTML.exists());
        assertTrue(fileHTML.delete());
    }

    @Test
    void createFolders() throws IOException {
        cS.createFolders(siteName, jsAnswer, cssAnswer);

        //test for js folder and delete
        File fileJS = new File (String.format("./data/%s/js", siteName));
        assertTrue(fileJS.exists());
        assertTrue(fileJS.delete());

        //test for css folder and delete
        File fileCSS = new File (String.format("./data/%s/css", siteName));
        assertTrue(fileCSS.exists());
        assertTrue(fileCSS.delete());

        //delete website directory
        File file = new File (String.format("./data/%s", siteName));
        assertTrue(file.delete());
    }
}