package exercise41.baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    Solution41 app = new Solution41();

    List<String> expected = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
            "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");


    @Test
    void scanInFile() throws IOException {
        Path path = Paths.get("data/exercise41_input.txt");
        Scanner inputTxt = new Scanner(path);

        assertEquals(expected, app.scanInFile(inputTxt));
    }
}