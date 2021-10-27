package exercise42.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ScanEmployeesToList {
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
        while ((line = reader.readLine()) != null) {
            Map<String, String> employee = new LinkedHashMap<>();
            String[] values = line.split(",");
            String[] keys = new String[]{"lName", "fName", "salary"};

            for (int i = 0; i < values.length; i++) {
                employee.put(keys[i], values[i]);
            }
            employeeList.add(employee);
        }
        return employeeList;
    }
}
