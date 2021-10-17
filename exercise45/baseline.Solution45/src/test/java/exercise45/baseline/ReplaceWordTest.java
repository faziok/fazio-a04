package exercise45.baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWordTest {
    ReplaceWord rw = new ReplaceWord();
    String target = "utilize";
    String replacement = "use";

    String oldTxt = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "utilizes an IDE to write her Java programs\".";

    String newTxt = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
            "uses an IDE to write her Java programs\".";

    @Test
    void scanInFile() throws IOException {
        assertEquals(oldTxt, rw.scanInFile());
    }

    @Test
    void replaceWord() {
        assertEquals(newTxt, rw.replaceWord(oldTxt, target, replacement));
    }

    @Test
    void printToFile() throws IOException {
        rw.printToFile("exercise45_output", newTxt);

        //test for js folder and delete
        File file = new File ("./data/exercise45_output.txt");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }
}