package exercise42.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.*;
import java.util.*;

public class Solution42 {

    /*
     *Construct a program that reads in the following data file
     * (you will need to create this data file yourself; name it `exercise42_input.txt`):
     *
     * Ling,Mai,55900
     * Johnson,Jim,56500
     * Jones,Aaron,46000
     * Jones,Chris,34500
     * Swift,Geoffrey,14200
     * Xiong,Fong,65000
     * Zarnecki,Sabrina,51500
     *
     * Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
     *
     * Example Output
     * Last      First     Salary
     * --------------------------
     * Ling      Mai       55900
     * Johnson   Jim       56500
     * Jones     Aaron     46000
     * Jones     Chris     34500
     * Swift     Geoffrey  14200
     * Xiong     Fong      65000
     * Zarnecki  Sabrina   51500
     *
     * Constraints
     * -Write your own code to parse the data. Don't use a CSV parser.
     */


    public static void main(String[] args) throws IOException {
        //read in file of employees
        BufferedReader reader1 = new BufferedReader(new FileReader("data/exercise42_input.txt"));

        //create object for reader
        ScanEmployeesToList employeeList1 = new ScanEmployeesToList(reader1);

        //read in file to List of Maps
        List<Map<String, String>> employeeList = new ArrayList<>(employeeList1.scanInFile(reader1));

        //create object for printer
        PrintTable table1 = new PrintTable(employeeList);

        //print table of employees
        table1.printTheTable(employeeList);
    }
}
