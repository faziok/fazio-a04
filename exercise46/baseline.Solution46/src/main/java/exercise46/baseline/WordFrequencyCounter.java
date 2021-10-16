package exercise46.baseline;

import java.util.*;

public class WordFrequencyCounter {
    public Map<String, Integer> getWordCount (String inputString){
        //create Map
        Map<String, Integer> map = new LinkedHashMap<>();
        //create string array of words split by space
        String[] tokens = inputString.split(" ");

        //for each word in the array
        //make word lowercase
        for (String token : tokens) {
            String word = token.toLowerCase();
            //if map contains the word
            //get value of word
            //update the word and the value + 1
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
                //else
                //put the word in the map with value of 1
            } else {
                map.put(word, 1);
            }
        }
        //return map
        return map;
    }

    public Map<String, Integer> getSortedMap (Map<String, Integer> map){
        //create a list of the map keys and values
        List<Map.Entry<String, Integer>> mapList = new ArrayList<>(map.entrySet());

        //sort the list by value
        mapList.sort(Map.Entry.comparingByValue());
        //reverse the order from most to least
        Collections.reverse(mapList);

        //create new map from sortedList
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : mapList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        //return sorted Map
        return sortedMap;
    }

    public void printHistogram (Map<String, Integer> map){
        //for each entrySet of the map
        //add semicolon to key string
        //print the key and the number of stars equal to the value number of the map
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            String key = entry.getKey() + ":";
            System.out.printf("%-10s%s%n",key, "*".repeat(Math.max(0, entry.getValue())));
        }
    }
}