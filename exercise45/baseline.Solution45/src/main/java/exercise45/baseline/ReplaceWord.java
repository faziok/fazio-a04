package exercise45.baseline;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceWord {

    public String scanInFile () throws IOException {
        //create scanner for file
        Scanner sc = new Scanner(new File("data/exercise45_input.txt"));

        //create string to read in each line and stringbuilder to put them together

        //while file has a next line
            //scan line to line
            //append line to string builder

        //return stringbuilder of oldTxt as a string
    }

    public String replaceWord (String oldTxt){
        //create newTxt instance variable

        //replace all words matching 'utilize' with 'use'
        //replace all words matching 'utilizes' with 'uses'

        //return newTxt
    }

    public void printToFile (String fileName, String newTxt) throws IOException {
        //try
            //create a new file using name chosen by user
            //create printerwriter for new file and print newTxt to file.
            //print file was written to console and close printer
    }
}
