package exercise44.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.io.*;
import java.util.*;

public class Solution44 {

    /*
     * Create a program that takes a product name as input and retrieves the current price and
     * quantity for that product. The product data is in a data file in the JSON format and
     *  looks like this (you will create this file as `exercise44_input.json`):
     *
     * {
     * "products" : [
     * {"name": "Widget", "price": 25.00, "quantity": 5 },
     * {"name": "Thing", "price": 15.00, "quantity": 5 },
     * {"name": "Doodad", "price": 5.00, "quantity": 10 }
     * ]}
     *
     * Print out the product name, price, and quantity if the product is found.
     * If no product matches the search, state that no product was found and start over.
     *
     * Example Output
     * What is the product name? iPad
     * Sorry, that product was not found in our inventory.
     * What is the product name? Galaxy
     * Sorry, that product was not found in our inventory.
     * What is the product name? Thing
     * Name: Thing
     * Price: 15.00
     * Quantity: 5
     *
     * Constraints
     * -The file is in the JSON format. Use a JSON parser to pull the values out of the file
     *      (e.g. https://github.com/google/gson (Links to an external site.)).
     * -If no record is found, prompt again.
     */

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution44 app = new Solution44();

        ProductSearch ps = new ProductSearch();
        //print found product info that matched user response
    }

    String scanInput(){
        //print prompt and scan in user input
        System.out.print("What is the product name? ");
        return input.nextLine();
    }
}