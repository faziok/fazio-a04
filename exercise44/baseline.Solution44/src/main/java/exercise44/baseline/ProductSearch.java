package exercise44.baseline;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductSearch {
    Solution44 app = new Solution44();

    public List<Map<String, String>> readJSON () throws IOException {
        //read in json file with reader and get path
        //create parse JSONobject
        //create new List of Maps to hold products and info
        //for every one of the "products" parse them into an array
        //create a new LinkedHashMap
        //add name, price, and quantity keys and their value read from the file
        //add current map to productList
        //return productList

        Reader reader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));
        JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

        List<Map<String, String>> productList = new ArrayList<>();

        for (JsonElement product : parser.get("products").getAsJsonArray()) {
            JsonObject obj = product.getAsJsonObject();

            Map<String, String> productMap = new LinkedHashMap<>();
            productMap.put("Name", obj.get("Name").getAsString());
            productMap.put("Price", obj.get("Price").getAsString());
            productMap.put("Quantity", obj.get("Quantity").getAsString());

            productList.add(productMap);
        }
        return productList;
    }

    public Map<String, String> productSearch (String searchName) throws IOException {
        //create map to hold the matched product when found
        //initialize boolean 'match' to verify match
        //do while match is not true
        //for the length of the map
        //if the key "Name" contains the searchedName
        //put map into new map.
        //set 'match' to true
        //if no match
        //print "Sorry, that product was not found in our inventory."
        //prompt for product name again
        //return matched map

        Map<String, String> productMatch = new LinkedHashMap<>();
        boolean match = false;

        do {
            for (Map<String, String> map : readJSON()) {
                if (map.get("Name").contains(searchName)) {
                    productMatch.putAll(map);
                    match = true;
                }
            }
            if (!match) {
                System.out.println("Sorry, that product was not found in our inventory.");
                searchName = app.scanInput();
            }
        }while(!match);

        return productMatch;
    }
}
