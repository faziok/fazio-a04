package exercise46.baseline;

import java.util.*;

public class WordFrequencyCounter {
    public Map<String, Integer> getWordCount (String inputString){
        //create Map
        Map<String, Integer> map = new LinkedHashMap<>();
        //create string array of words split by space

        //for each word in the array
        //make word lowercase
            //if map contains the word
            //get value of word
            //update the word and the value + 1
        //return map
    }

    public Map<String, Integer> getSortedMap (Map<String, Integer> map){
        //create a list of the map keys and values
        List<Map.Entry<String, Integer>> mapList = new ArrayList<>(map.entrySet());

        //sort the list by value

        //create new map from sortedList

        //return sorted Map
    }

    public void printHistogram (Map<String, Integer> map){
        //for each entrySet of the map
        //add semicolon to key string
        //print the key and the number of stars equal to the value number of the map
    }
}
