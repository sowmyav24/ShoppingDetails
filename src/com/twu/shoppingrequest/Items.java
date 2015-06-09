package com.twu.shoppingrequest;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Items {

    private String input;

    public String[] parseInput(String input) {

        String[] subString = input.split(" ");
        return subString;
    }

    public ItemDetails addDetails(String[] subString) {
        String details="";
        for (int i = 1; i < subString.length - 1; i++) {
            details += subString[i];
        }
        ItemDetails itemDetails = new ItemDetails(parseInt(subString[0]), details, parseDouble(subString[subString.length - 1]));
        double tax = itemDetails.calculateTax();
        System.out.print("Sales Tax ");
        System.out.print(tax);
        return itemDetails;
    }

    public static void main(String args[]) {
        System.out.println("Enter one line of input");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Items items = new Items();
        String[] subString = items.parseInput(input);
        items.addDetails(subString);
    }
}
