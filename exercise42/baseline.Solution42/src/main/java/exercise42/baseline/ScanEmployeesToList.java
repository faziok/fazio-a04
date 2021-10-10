package exercise42.baseline;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScanEmployeesToList {
    BufferedReader reader;

    //constructor
    ScanEmployeesToList (BufferedReader reader){
        this.reader = reader;
    }

    public List<Map<String, String>> scanInFile (BufferedReader reader) throws IOException {
        //initialize new employee list of employee maps
        List<Map<String, String>> employeeList = new ArrayList<>();

        //initialize String to read in lines from file
        String line;

        //while there are lines to read in
            //initialize a new Map
            //split the line into a string array of values delimited by ","
            //Initialize a string array of keys for the map.

            //for the length of the Values string array
                //put key and value into map

            //add map to employeeList

        //return employeeList
    }
}
