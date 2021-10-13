package exercise41.baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    List<String> namesOriginal = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
              "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");

    List<String> expectedSorted = Arrays.asList("Johnson, Jim", "Jones, Aaron", "Jones, Chris",
            "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina");

    SortList list1 = new SortList();


    @Test
    void getSortedList() {

        assertEquals(expectedSorted, list1.getSortedList(namesOriginal));

    }
}