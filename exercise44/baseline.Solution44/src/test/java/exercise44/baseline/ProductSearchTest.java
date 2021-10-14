package exercise44.baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {
    ProductSearch app = new ProductSearch();

    @Test
    void productSearch() throws IOException {
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("Name", "Widget");
        map1.put("Price", "25.00");
        map1.put("Quantity", "5");

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("Name", "Thing");
        map2.put("Price", "15.00");
        map2.put("Quantity", "5");

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("Name", "Doodad");
        map3.put("Price", "5.00");
        map3.put("Quantity", "10");

        List<Map<String, String>> expected = new ArrayList<>();
        expected.add(map1);
        expected.add(map2);
        expected.add(map3);

        assertEquals(expected, app.readJSON());
    }

    @Test
    void testProductSearch() throws IOException {
        //test size of map
        assertEquals(3, app.productSearch("Thing").size());
    }
}