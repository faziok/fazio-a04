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

    public String replaceWord (String oldTxt, String target, String replacement){
        //create newTxt instance variable
        String newTxt;

        //get char array of the target and replacement word
        char[] replacementArr = replacement.toCharArray();
        char[] targetArr = target.toCharArray();

        //change first letter of replacement word to uppercase
        char replaceUpperCase = Character.toUpperCase(replacementArr[0]);
        replacementArr[0] = replaceUpperCase;

        //change first letter of target word to uppercase
        char tarUpperCase = Character.toUpperCase(targetArr[0]);
        targetArr[0] = tarUpperCase;

        //convert arrays to string for uppercase target and replacement words
        String replacementUpperCase = String.valueOf(replacementArr);
        String targetUpperCase = String.valueOf(targetArr);

        //replace all target words with replacement word even if capitalized
        newTxt = oldTxt.replace(target, replacement);
        newTxt = newTxt.replace(targetUpperCase, replacementUpperCase);

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
