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

}
