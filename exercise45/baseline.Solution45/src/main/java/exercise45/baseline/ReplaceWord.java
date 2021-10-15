package exercise45.baseline;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWord {

    public String scanInFile () throws IOException {
        //create scanner for file
        Scanner sc = new Scanner(new File("data/exercise45_input.txt"));

        //create string to read in each line and stringbuilder to put them together
        String line;
        StringBuilder sb = new StringBuilder();

        //while file has a next line
        //scan line to line
        //append line to string builder
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            sb.append(line).append("\n");
        }

        //close scanner
        sc.close();

        //return stringbuilder of oldTxt as a string (trim to remove last empty line)
        return sb.toString().trim();
    }

    public String replaceWord (String oldTxt){
        //create newTxt instance variable
        String newTxt;

        //replace all words matching 'utilize' with 'use'
        //replace all words matching 'utilizes' with 'uses'
        newTxt = oldTxt.replaceAll("\\butilize\\b", "use");
        newTxt = newTxt.replaceAll("\\butilizes\\b", "uses");

        //return newTxt
        return newTxt;
    }

    public void printToFile (String fileName, String newTxt) throws IOException {
        //try
        try {
            //create a new file using name chosen by user
            File file = new File("data/" + fileName + ".txt");

            //create printerwriter for new file and print newTxt to file.
            PrintWriter pWriter = new PrintWriter(file);
            pWriter.write(newTxt);

            //print file was written to console and close printer
            System.out.println("File written Successfully");
            pWriter.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
