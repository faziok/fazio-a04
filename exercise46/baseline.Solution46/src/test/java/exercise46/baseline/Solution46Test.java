package exercise46.baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {
    Solution46 app = new Solution46();

    String fileTxt = "badger badger badger badger mushroom mushroom snake badger badger badger";


    @Test
    void scanInFile() throws IOException {
        assertEquals(fileTxt, app.scanInFile());
    }
}