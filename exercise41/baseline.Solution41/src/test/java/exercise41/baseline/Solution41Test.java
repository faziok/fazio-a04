package exercise41.baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    Solution41 app = new Solution41();

    List<String> expectedList = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
            "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");
    List<String> expectedFile = Arrays.asList("Total of 7 names", "-----------------",
                    "Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
                    "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");


    @Test
    void scanInFile() throws IOException {
        Path path = Paths.get("data/exercise41_input.txt");
        Scanner inputTxt = new Scanner(path);

        assertEquals(expectedList, app.scanInFile(inputTxt));
    }


    @Test
    void printToFile() throws IOException {
        app.printToFile(expectedList);

        File file = new File("data/exercise41_output.txt");
        Scanner inputTxt = new Scanner(file);

        assertTrue(file.exists());

        List<String> namesFile = new ArrayList<>();
        try(inputTxt) {
            while (inputTxt.hasNextLine()) {
                namesFile.add(inputTxt.nextLine());
            }
        }

        assertEquals(expectedFile, namesFile);
        assertTrue(file.delete());
    }
}