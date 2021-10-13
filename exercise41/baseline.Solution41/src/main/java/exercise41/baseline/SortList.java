package exercise41.baseline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public List<String> getSortedList(List<String> namesList){
        //create new list to prevent modifying original list
        List<String> copyList = new ArrayList<>(namesList);

        //compare each string in the list and sort by the last name.
        copyList.sort(Comparator.comparing(String::toString));

        //return the sorted list
        return copyList;
    }
}
