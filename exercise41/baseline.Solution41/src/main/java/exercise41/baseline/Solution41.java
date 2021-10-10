package exercise41.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution41 {

    /*
     *Create a program that reads in the following list of names from a file called
     * `exercise41_input.txt` and sorts the list alphabetically:
     *
     * Ling, Mai
     * Johnson, Jim
     * Zarnecki, Sabrina
     * Jones, Chris
     * Jones, Aaron
     * Swift, Geoffrey
     * Xiong, Fong
     *
     * Then print the sorted list to a file called `exercise41_output.txt`
     *  that looks like the following example output.
     *
     * Example Output
     * Total of 7 names
     * -----------------
     * Johnson, Jim
     * Jones, Aaron
     * Jones, Chris
     * Ling, Mai
     * Swift, Geoffrey
     * Xiong, Fong
     * Zarnecki, Sabrina
     *
     * Constraint
     * -Don't hard-code the number of names.
     */

    public static void main(String[] args) throws IOException {
        Solution41 app = new Solution41();

        //create Path object for 'exercise41_input.txt.
        Path path = Paths.get("data/exercise41_input.txt");

        //scan in the file into a list
        Scanner inputTxt = new Scanner(path);
        List<String> namesList = new ArrayList<>(app.scanInFile(inputTxt));

        SortList list1 = new SortList(namesList);

        //Get the list of sorted names
        List<String> sortedNamesList = new ArrayList<>(list1.getSortedList(namesList));

        //create new file and print the sorted list
        app.printToFile(sortedNamesList);

    }

    public List<String> scanInFile (Scanner fileScanner) {
        //try if the scanner has a next line and if it does add each line to List
        //return the List
        List<String> namesFile = new ArrayList<>();
        try(fileScanner) {
            while (fileScanner.hasNextLine()) {
                namesFile.add(fileScanner.nextLine());
            }
        }
        return namesFile;
    }

    private void printToFile (List<String> output) throws IOException {
        //create header for the file as a string
        //create a File object path for the output text
        //if the output file doesn't exist, create it
        //write header and sorted list to output file
        //for the length of the list
        //write string to file
        //print a message to console if it was written correctly

        BufferedWriter buffWriter = null;

        try {
            String header = "Total of " + output.size() + " names\n" + "-----------------\n";
            //Specify the file name and path here
            File file = new File("data/exercise41_output.txt");

            //make sure that the file exists, if not it will create it.
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            buffWriter = new BufferedWriter(fileWriter);
            buffWriter.write(header);

            for (int i = 0; i < output.size(); i++){
                buffWriter.write(output.get(i) + "\n");
            }

            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(buffWriter!=null)
                    buffWriter.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
