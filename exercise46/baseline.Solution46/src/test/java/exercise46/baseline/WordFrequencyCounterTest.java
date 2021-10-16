package exercise46.baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {
    WordFrequencyCounter wfc = new WordFrequencyCounter();

    String fileTxt = "badger badger badger badger mushroom mushroom snake badger badger badger snake " +
            "snake snake snake snake snake snake snake";

    Map<String, Integer> testList1 = Map.of("badger", 7, "mushroom", 2, "snake", 9);
    Map<String, Integer> testList2 = Map.of("snake", 9, "badger", 7, "mushroom", 2);

    @Test
    void getWordCount() {
        assertEquals(testList1, wfc.getWordCount(fileTxt));
    }

    @Test
    void getSortedMap() {
        assertEquals(testList2, wfc.getSortedMap(testList1));
    }
}